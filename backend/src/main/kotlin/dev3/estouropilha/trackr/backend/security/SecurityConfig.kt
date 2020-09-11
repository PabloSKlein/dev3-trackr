package dev3.estouropilha.trackr.backend.security

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Autowired
    private lateinit var userDetailsService: UserDetailsService

    @Autowired
    private lateinit var jwtHelper: JwtHelper

    private val encoder = BCryptPasswordEncoder()

    override fun configure(http: HttpSecurity) {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"/signup")
                .permitAll()
                .anyRequest()
                .authenticated()

        http.addFilter(JwtAuthenticationFilter(authenticationManager(), jwtHelper = jwtHelper))
        //http.addFilter(JWTAuthorizationFilter(authenticationManager(), jwtUtil = jwtUtil, userDetailService = userDetailsService))
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

//    @Bean
//    fun bCryptPasswordEncoder(): BCryptPasswordEncoder {
//        return BCryptPasswordEncoder()
//    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder)
    }
}


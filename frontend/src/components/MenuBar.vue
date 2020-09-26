<template>
  <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
    <div class="sidebar-sticky pt-3">
      <ul class="nav flex-column">
        <li class="nav-item">
          <a class="nav-link active" href="#">
            <home-icon size="1.0x"></home-icon>Dashboard
            <span class="sr-only">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <file-icon size="1.0x"></file-icon>Consultar
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <shopping-cart-icon size="1.0x"></shopping-cart-icon>Cadastrar
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <users-icon size="1.0x"></users-icon>Usuário
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <bar-chart-2-icon size="1.0x"></bar-chart-2-icon>Relatórios
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <layers-icon size="1.0x"></layers-icon>Integração
          </a>
        </li>
      </ul>

      <h6
        class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted"
      >
        <span>Imprimir Rastreios</span>
        <a class="d-flex align-items-center text-muted" href="#" aria-label="Add a new report">
          <plus-circle-icon size="1.0x"></plus-circle-icon>
        </a>
      </h6>
      <ul class="nav flex-column mb-2">
        <li class="nav-item">
          <a class="nav-link" href="#">
            <file-text-icon size="1.0x"></file-text-icon>Mês Atual
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <file-text-icon size="1.0x"></file-text-icon>Semana Atual
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">
            <file-text-icon size="1.0x"></file-text-icon>Dia de Hoje
          </a>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import Vue from "vue";
import {
  PlusCircleIcon,
  FileIcon,
  ShoppingCartIcon,
  UsersIcon,
  BarChart2Icon,
  LayersIcon,
  HomeIcon,
  FileTextIcon,
} from "vue-feather-icons";

export default Vue.extend({
  name: "MenuBar",
  components: {
    PlusCircleIcon,
    FileIcon,
    ShoppingCartIcon,
    UsersIcon,
    BarChart2Icon,
    LayersIcon,
    HomeIcon,
    FileTextIcon,
  },
});
</script>

<style>
</style>

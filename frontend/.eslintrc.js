module.exports = {
  root: true,
  env: {
    node: true
  },
  extends: [
    'plugin:vue/essential',
    '@vue/standard',
    '@vue/typescript/recommended'
  ],
  parserOptions: {
    ecmaVersion: 2020
  },
  rules: {
    'no-console': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'no-debugger': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'quotes': 'off',
    'singlequote': 'off',
    'semi': 'off',
    'comma-dangle': 'off',
    'indent': 'off',
    'no-multiple-empty-lines': 'off',
    'no-var': 'off',
    'new-parens': 'off',
    'padded-blocks': 'off',
    'eol-last': 'off',
    'no-undef': 'off',
    '@typescript-eslint/no-use-before-define': 'off',
  }
}

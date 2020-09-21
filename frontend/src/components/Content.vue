<template>
  <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-md-4">
    <div id="container">
      <h2>Rastreios</h2>
      <div class="table-responsive">
        <table class="table table-striped table-sm">
          <thead>
            <tr>
              <th>#</th>
              <th>Transportadora</th>
              <th>Código</th>
              <th>Data</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>0</td>
              <td>AZUL Cargo</td>
              <td>456784164587465646</td>
              <td>17/08/2020 09:52</td>
              <td>EM TRANSFERÊNCIA</td>
            </tr>
            <tr>
              <td>1</td>
              <td>TRANSPORTADORA AMERICANA</td>
              <td>AM4596464651231</td>
              <td>15/08/2020 18:42</td>
              <td>EM TRANSFERÊNCIA</td>
            </tr>
            <tr>
              <td>2</td>
              <td>TRANSPORTADORA AMERICANA</td>
              <td>AM4596464651231</td>
              <td>15/08/2020 18:42</td>
              <td>EM TRANSFERÊNCIA</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </main>
</template>

<script>
import Vue from "vue";

export default Vue.extend({
  name: "Content",
  components: {},
  props: {},
});
</script>

<style>
</style>

<template>
    <md-layout md-gutter>
        <bkf-trecho :trecho="trecho" v-show="!erro"></bkf-trecho>
        <div class="falha" v-show="erro">Houve um erro. Por favor tente novamente mais tarde.</div>
    </md-layout>
</template>

<script>
    import Trecho from '@/components/Trecho'
    import axios from 'axios'    
    
 export default { 
     name: 'TrechoDoDia', 
     
     data() {
         return {
             trecho: null,
             erro: false
         }
     },
     
     components: {
         'bkf-trecho': Trecho
     },

     created() {
         console.log(this.id);
       this.buscarDados();  
     },
     
  methods: {
      buscarDados() {
          // console.log(this.$route.params);
          // TODO tornar esse trecho variavel a cada dia
          axios.get('http://localhost:9000/trechos/1')
            .then((resp) => {
              this.erro = false;
              this.trecho = resp.data
              console.log(resp)
            })
            .catch((err) => {
              this.erro = true;
              console.log(err)
            });
      }
  }
};
</script>

<style>
</style>

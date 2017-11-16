<template>
    <md-whiteframe>
        <md-layout style="margin: 20px;">
        <md-card class="trecho-bkf">
            <div class="md-title"><h1>Trecho do Dia</h1></div>
            <md-layout class=trecho-do-dia>
                <bkf-trecho :trecho="trecho" v-if="trecho != null"></bkf-trecho>
                <div class="falha" v-else>Houve um erro. Por favor tente novamente mais tarde.</div>
            </md-layout>
        </md-card>
        </md-layout>
    </md-whiteframe>
</template>

<script>
    import Trecho from '@/components/Trecho'
    import axios from 'axios'    
    
 export default { 
     name: 'TrechoDoDia', 
     
     data() {
         return {
             trecho: null
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
              this.trecho = resp.data
              console.log(resp)
            })
            .catch((err) => {
              console.log(err)
            })
      }
    }
};
</script>

<style>
    .trecho-do-dia{
        margin: 20px; 
        min-height: 70vh;
    }
     .trecho-bkf{
        text-align: center; 
        width: 100%;
        font-size: 24px;
    }
</style>

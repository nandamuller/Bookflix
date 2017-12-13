<template>
    <div class="trecho-bkf">
        <md-layout style="margin: 20px;">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-card md-elevation="0">
                    <md-card-content>
                        <trecho>
                            <bkf-trecho class="bkf-biblioteca" :key="trecho.id" :trecho="trecho"></bkf-trecho>
                        </trecho>
                    </md-card-content>
              
        <md-layout style="margin: 20px;">
            <md-layout md-gutter="8">
                <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                    <md-whiteframe>
                        <div class="bkf-header"><h2>Mais trechos desse autor</h2>
                        </div>
                            
                    </md-whiteframe>
                </md-layout>
                
                <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                    <md-whiteframe>
                        <div class="bkf-header"><h2>Mais obras desse autor</h2>
                        </div>
                    </md-whiteframe>
                    </md-layout>
                </md-layout>
                    </md-layout>
                </md-card>
            </md-layout>
    </md-layout>
</div>
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
         // debugger;
       this.buscarDados();  
     },
     
     watch: {
         '$route': 'buscarDados'
     },
     
  methods: {
      buscarDados() {
          this.id = this.$route.params.id;
          // TODO tornar esse trecho variavel a cada dia
          axios.get('http://localhost:9000/trechos/' + this.id)
                    .then((resp) => {
                        this.erro = false;
                        this.trecho = resp.data;
                        console.log(resp)
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
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
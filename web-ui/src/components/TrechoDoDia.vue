<template>
    <md-whiteframe>
        <md-layout style="margin: 20px;">
        <md-card class="trecho-bkf">
            <div class="md-title"><h1>Trecho do Dia</h1></div>
            <md-layout class=trecho-do-dia>
                <bkf-trecho :trecho="trecho" v-if="trecho != null"></bkf-trecho>
                <div class="falha" v-else>Houve um erro. Por favor tente novamente mais tarde.</div>
            </md-layout>
            <div class="trechobar-bkf" md-gutter>
            <md-bottom-bar>
                  <md-bottom-bar-item md-icon="info outline"@click="openDialog('dialog1')">Info</md-bottom-bar-item>
                  <md-bottom-bar-item md-icon="near_me">Compartilhar</md-bottom-bar-item>
            </md-bottom-bar>
            <md-dialog md-open-from="#custom" md-close-to="#custom" ref="dialog1">
                <md-dialog-title>Informações Extras</md-dialog-title>
                <md-dialog-content><p>
                                Autor: {{ trecho.autor }}<br>
                                Obra: {{ trecho.obra }}<br>
                            </p></md-dialog-content>
                <md-dialog-actions>
                    <md-button class="md-primary" @click="closeDialog('dialog1')">Ok</md-button>
                </md-dialog-actions>
            </md-dialog>                    
        </div>
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
      },
        openDialog(ref) {
          this.$refs[ref].open();
        },
        closeDialog(ref) {
          this.$refs[ref].close();
        },
        onOpen() {
          console.log('Opened');
        },
        onClose(type) {
          console.log('Closed', type);
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

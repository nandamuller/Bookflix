<template>    
    <div class="trecho-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ trecho.conteudo }}"<br>
                      {{ trecho.obra.autor.nome }} em {{ trecho.obra.titulo }} disponível <a :href="trecho.referencia" target="_blank">aqui</a>.
                  </div>
              </md-card-content>
                <div class="trechobar-bkf" md-gutter>
                    <md-bottom-bar>
                        <!-- TODO corrigir isto aqui que esta gerando erros: os itens devem estar diretamente dentro da barra e nao dentro do link -->
                        <router-link v-bind:to="url()">
                            <md-bottom-bar-item md-icon="info outline">Info</md-bottom-bar-item>
                        </router-link>  
                        <div class="addthis_inline_share_toolbox_7aix"></div>
                    </md-bottom-bar>
    </div>
    </md-card>
    </div>
   
</template>

<script>
    
 export default { 
     name: 'DialogCustom',
    data: () => ({
      showDialog: false
    }),
     name: 'Trecho',

     props: {
         trecho: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.trecho.id);
     },
     
    methods: {
        url() {
            return '/trechos/' + this.trecho.id;
        }
    }
};
</script>

<style>
    .md-dialog {
    max-width: 768px;
  }
    trecho-bkf{
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-trecho-bkf{
        font-size: 24px;
    }
    .md-dialog {
    max-width: 768px;
  }
</style>

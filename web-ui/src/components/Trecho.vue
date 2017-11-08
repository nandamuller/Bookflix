<template>    
    <div class="trecho-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ trecho.conteudo }}"</div>
              </md-card-content>
        </md-card>
        <div class="trechobar-bkf" md-gutter>
            <md-bottom-bar>
                  <md-bottom-bar-item md-icon="info outline"@click="openDialog('dialog1')">Info</md-bottom-bar-item>
                  <md-bottom-bar-item md-icon="favorite">Favoritos</md-bottom-bar-item>
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
    </div>
</template>

<script>
    
 export default { 
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
    trecho-bkf{
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-trecho-bkf{
        font-size: 24px;
    }
</style>

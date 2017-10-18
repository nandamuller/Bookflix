<template>
    <md-layout md-gutter>
                <div class="trecho-bkf">
                    <md-card md-elevation="0">
                          <md-card-content style="min-height: 70vh;">
                            "Ao vencido, ódio ou compaixão;<br>
                              ao vencedor, as batatas."
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
                                            Quincas Borba é um romance escrito por Machado de Assis, desenvolvido em princípio como folhetim na revista A Estação, entre os anos de 1886 e 1891 para, em 1892, ser publicado definitivamente pela Livraria Garnier.<br>
                                            Data da primeira publicação: 1891<br>
                                            Autor: Machado de Assis<br>
                                            Idioma original: Língua portuguesa<br>
                                            Gênero: Ficção<br>
                                            Editora: Livraria Garnier (primeira edição)<br>
                                            País: Brasil
                                        </p></md-dialog-content>
                            <md-dialog-actions>
                                <md-button class="md-primary" @click="closeDialog('dialog1')">Ok</md-button>
                            </md-dialog-actions>
                        </md-dialog>                    
                    </div>
                </div>
        </md-layout>
</template>

<script>
 export default {
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
    .trecho-bkf{
        margin: 150px;
        margin-top: 0px;
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-trecho-bkf{
        font-size: 24px;
    }
</style>

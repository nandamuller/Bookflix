<template>
<div>
    <div class="bkf-header">
            <h1>Gerenciamento de Trechos</h1>
    </div>
        <md-layout style="margin: 20px;">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                     <div class="bkf-header"><h2>Cadastre</h2></div>
                        <div class="bkf-cadastro">
                            <md-input-container>
                                <label>Trecho</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Obra</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Autor</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Referência</label>
                                <md-textarea></md-textarea>
                            </md-input-container>
                            <button type="button" class="button buttonBlue">Enviar
                                <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
                            </button>
                        </div>
                </md-whiteframe>
        </md-layout>
    </md-layout>
    <md-layout style="margin: 20px;">
        <md-layout md-gutter="8">
                <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                    <md-whiteframe>
                         <div class="bkf-header"><h2>Altere</h2></div>
                    </md-whiteframe>
                </md-layout>
                 <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                    <md-whiteframe>
                         <div class="bkf-header"><h2>Exclua</h2></div>
                    </md-whiteframe>
                </md-layout>
            </md-layout>
        </md-layout>
</div>
</template>

<script>
    export default {
        data () {
            return {
            }
        },
        components: {
        }
    }
</script>

<style>
    .bkf-cadastro{
        margin: 0 70px;
    }
</style>
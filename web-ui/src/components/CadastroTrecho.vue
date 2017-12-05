<template>
<div>
    <div class="bkf-header">
            <h1>Gerenciamento de Trechos</h1>
    </div>
        <md-layout style="margin: 20px;">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                    <md-card>
                     <div class="bkf-header"><h2>Cadastre</h2></div>
                        <div class="bkf-cadastro">
                            <md-input-container>
                                <label>Trecho</label>
                                <md-textarea id="txtTrecho"></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Obra</label>
                                <md-textarea id="txtObra"></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Autor</label>
                                <md-textarea id="txtAutor"></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Referência</label>
                                <md-textarea id="txtRef"></md-textarea>
                            </md-input-container>
                            <button type="button" class="button buttonBlue" v-on:click="realizaLogin">Enviar
                                <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
                            </button>
                        </div>
                        <div id="alert">
                            <md-card class="md-accent" md-with-hover>
                                <h2>Preencha todos os campos!</h2>
                                <md-button :md-ripple="false">Ok!</md-button>
                            </md-card>
                        </div>
                        <div id="alertSucesso">
                            <md-card class="md-accent" md-with-hover>
                                <h2>Sucesso!</h2>
                                <md-button :md-ripple="false">Ok!</md-button>
                            </md-card>
                        </div>
                    </md-card>
                </md-whiteframe>
        </md-layout>
    </md-layout>
</div>
</template>

<script>
    import axios from 'axios'
    
    export default {
        data () {
            return {
            }
        },
        components: {
        },
        methods: {
        realizaLogin(){
            var trechotx = document.getElementById('txtTrecho').value;
            var autortx = document.getElementById('txtAutor').value;
            var obratx = document.getElementById('txtObra').value;
            var reftx = document.getElementById('txtRef').value;
            if(trechotx == '' || autortx == '' || obratx == '' || reftx == ''){
                document.getElementById('alert').style.display="block";
            }else{
                axios.all([
                    axios.post('http://localhost:9000/trecho',{
                    conteudo: trechotx       
                }),
                    axios.post('http://localhost:9000/autor',{
                    autor: autortx
                  }),
                    axios.post('http://localhost:9000/obra',{
                    autor: obratx
                  }),
                    axios.post('http://localhost:9000/trecho',{
                    referencia: reftx
                  })
                ])
            .then(function(response){
                console.log(response);
            })
            .catch(function(error){
                console.log(error);
            });
                document.getElementById('alertSucesso').style.display="block";
              }
            }
        }
    }
</script>

<style>
    .bkf-cadastro{
        margin: 0 70px;
    }
    #alert{
        display: none;
        left: 25%;
        top: 25%;
    }
    #alertSucesso{
        display: none;
        left: 25%;
        top: 25%;
    }
</style>
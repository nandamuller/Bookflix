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
                                <md-textarea id="txtTrecho" v-model="trecho.conteudo"></md-textarea>
                            </md-input-container>
                            <md-input-container>
                                <label>Obra</label>
                                <md-select id="txtObra" v-model="trecho.obra.id" selected="">
                                    <md-option disabled value="" >Selecione uma obra</md-option>
                                    <md-option v-for="obra in obras" :key="obra.id" :value="obra.id">{{ obra.titulo }}</md-option>
                                </md-select>
                            </md-input-container>
                            <md-input-container>
                                <label>Autor</label>
                                <md-select id="txtAutor" v-model="autorSelecionado" selected="">
                                    <md-option disabled value="" >Selecione um autor</md-option>
                                    <md-option v-for="autor in autores" :key="autor.id" :value="autor.id">{{ autor.nome }}</md-option>
                                </md-select>
                            </md-input-container>
                            <md-input-container>
                                <label>Referência</label>
                                <md-textarea id="txtRef" v-model="trecho.referencia"></md-textarea>
                            </md-input-container>
                            <button type="button" class="button buttonBlue" v-on:click="cadastrar">Enviar
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
        created() {
            this.buscarAutores();
            this.buscarObras();
        },
        data() {
            return {
                autorSelecionado: '',
                autores: [],
                obras: [],
                trecho: {
                    // autor: 'Lorem Ipsum',
                    // obra: 'http://localhost:9000/obras/3',
                    //                    {
                    //                        id: 3,
                    //                        href: 'http://localhost:9000/obras/3',
                    //                        titulo: 'Quincas Borba - gambiarrado'
                    //                    },
                    conteudo: 'Dolor sit amet!',
                    referencia: 'http://google.com',
                    obra: {
                        id: ''
                    }
                }
            }
        },
        components: {},
        methods: {
            cadastrar() {
                //            var trechotx = document.getElementById('txtTrecho').value;
                //            var autortx = document.getElementById('txtAutor').value;
                //            var obratx = document.getElementById('txtObra').value;
                //            var reftx = document.getElementById('txtRef').value;

                if (false) {
                    document.getElementById('alert').style.display = "block";
                } else {
                    axios.post('http://localhost:9000/trechos', this.trecho)
                        .then(function(response) {
                            console.log(response);
                        })
                        .catch(function(error) {
                            console.log(error);
                        });
                    document.getElementById('alertSucesso').style.display = "block";
                }
            },
            
            buscarAutores() {
                axios.get('http://localhost:9000/autores')
                    .then(response => {
                        console.log(response);
                        this.autores = response.data._embedded.autores;
                    })
                    .catch(function(error) {
                        console.log(error);
                    });
            },
            
            buscarObras() {
                axios.get('http://localhost:9000/obras')
                    .then(response => {
                        console.log(response);
                        this.obras = response.data._embedded.obras;
                    })
                    .catch(function(error) {
                        console.log(error);
                    });
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
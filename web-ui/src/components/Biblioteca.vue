<template>
    <md-whiteframe>
        <md-card class="bkf-conheca">
            <div class="bkf-header">
                    <h1>Sua Pesquisa</h1>
                        <md-bottom-bar>
                             <md-input-container md-clearable>
                                <label>Pesquise</label>
                                <md-input type="search"></md-input>
                                 <!-- TODO encontrar como faz para saber o que foi digitado no md-input e utilizar o texto para a pesquisa abaixo (da mesma maneira que fazemos com os trechos ao carregar este componente, com o axios) -->
                                 <!-- /autores/search/findByNomeContainingIgnoreCase?nome=Machado -->
                                 <!-- /trechos/search/findByConteudoContainingIgnoreCase?conteudo=batata -->
                                 <!-- criar uma maneira de exibir os resultados -->
                            </md-input-container>
                            <md-button class="md-icon-button" click="myFunction()">
                                <md-icon>search</md-icon>
                            </md-button>
                        </md-bottom-bar>
                </div>
            </md-card>
        
             <md-card class="bkf-conheca" style="min-height: 30vh;">
                <div class="bkf-biblioteca" style="min-height: 30vh;">  
                <md-boards :md-auto="true" :md-infinite="true" :md-duration="5000" :md-swipeable="true">
                  <md-board id="slide1">
                    <p>"Ao vencido, ódio ou compaixão;<br>
                        ao vencedor, as batatas."</p>
                  </md-board>

                  <md-board id="slide2">
                      <p>"Ao vencido, ódio ou compaixão;<br>
                              ao vencedor, as batatas."</p>
                  </md-board>

                  <md-board id="slide3">
                    <p>"Ao vencido, ódio ou compaixão;<br>
                              ao vencedor, as batatas."</p>
                  </md-board>
                </md-boards>
            </div>
        </md-card>
        
        <div class="bkf-header">
            <h1>Conheça a Biblioteca</h1>
        </div>
    <md-layout style="margin: 20px;">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                    <md-layout>
                        <md-whiteframe>
                            <div class="bkf-header"><h2>Trechos</h2></div>
                            <bkf-trecho class="bkf-biblioteca" v-for="trecho in trechos"  :key="trecho.id" :trecho="trecho"></bkf-trecho>
                        </md-whiteframe>
                    </md-layout>
                </md-whiteframe>
            </md-layout>
        </md-layout>
</md-whiteframe>
</template>

<script>
    import Trecho from '@/components/Trecho'
    import axios from 'axios'
    
    export default {
        
        components: {
            'bkf-trecho': Trecho
        }, 
        data() {
            return {
                trechos: []
            }
        },
        
        created() {
            console.log(this.id);
            this.buscarDados();  
        },

        methods: {
            buscarDados() {
                axios.get('http://localhost:9000/trechos')
                    .then((resp) => {
                        this.erro = false;
                        this.trechos = resp.data._embedded.trechos;
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
    }
</script>

<style>
    .bkf-conheca{
        margin: 20px;
    }
    .txt-bkf.conheca{
        font-size: 20px;
        line-height: 40px;
    }
    .bkf-biblioteca{
        margin-top: 40px;
    }
    .bkf-header{
        margin: 40px;
    }
    
</style>

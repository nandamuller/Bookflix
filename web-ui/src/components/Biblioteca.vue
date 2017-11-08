<template>
    <md-whiteframe>
        <md-card class="bkf-conheca" style="min-height: 30vh;">
            <md-card-header>
                <md-card-header-text>
                        <md-bottom-bar style='height: 0px;'>
                            <md-button class="md-icon-button">
                                <md-icon>search</md-icon>
                            </md-button>
                                <md-chip md-editable style="flex: 1"></md-chip>
                        </md-bottom-bar >
                </md-card-header-text>
            </md-card-header>
                <div class="bkf-header">
                    <h1>Sua Pesquisa</h1>
                </div>
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
            <div>
                <md-chip md-deletable>Quincas Borba</md-chip>
                <md-chip md-deletable>Ficção</md-chip>
                <md-chip md-deletable>Livraria Garnier</md-chip>
            </div>
        </md-card>
        
        <div class="bkf-header">
            <h1>Conheça a Biblioteca</h1>
        </div>
    <md-layout style="margin: 20px;">
        <md-layout md-gutter="8">
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                    <bkf-trecho class="bkf-biblioteca" v-for="trecho in trechos"  :key="trecho.id" :trecho="trecho"></bkf-trecho>
                </md-whiteframe>
            </md-layout>

            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                    <bkf-trecho class="bkf-biblioteca" v-for="trecho in trechos"  :key="trecho.id" :trecho="trecho"></bkf-trecho>
                </md-whiteframe>
            </md-layout>
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
        margin-top: 45px;
    }
    .bkf-header{
        margin-top: 20px;
    }
    
</style>

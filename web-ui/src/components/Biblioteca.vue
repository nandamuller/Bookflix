<template>
    <md-whiteframe>
        <md-card class="bkf-conheca" style="min-height: 30vh;">
            <md-card-header>
                <md-card-header-text>
                        <md-bottom-bar style='height: 0px;'>
                             <md-input-container md-clearable>
                                <label>Pesquise</label>
                                <md-input></md-input>
                            </md-input-container>
                            <md-button class="md-icon-button">
                                <md-icon>search</md-icon>
                            </md-button>
                        </md-bottom-bar>
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
                     <div class="bkf-header"><h2>Trechos</h2></div>
                    <bkf-trecho class="bkf-biblioteca" v-for="trecho in trechos"  :key="trecho.id" :trecho="trecho"></bkf-trecho>
                </md-whiteframe>
            </md-layout>
            <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                     <div class="bkf-header"><h2>Autores</h2></div>
                    <bkf-autor class="bkf-biblioteca" v-for="autor in autores"  :key="autor.id" :autor="autor"></bkf-autor>
                </md-whiteframe>
            </md-layout>
             <md-layout md-column md-flex-xsmall="100" md-flex-small="100" md-flex-medium="100">
                <md-whiteframe>
                     <div class="bkf-header"><h2>Obras</h2></div>
                    <bkf-obra class="bkf-biblioteca" v-for="obra in obras"  :key="obra.id" :obra="obra"></bkf-obra>
                </md-whiteframe>
            </md-layout>
        </md-layout>
    </md-layout>
</md-whiteframe>
</template>

<script>
    import Trecho from '@/components/Trecho'
    import Autor from '@/components/Autor'
    import Obra from '@/components/Obra'
    import axios from 'axios'
    
    export default {
        
        components: {
            'bkf-trecho': Trecho,
            'bkf-autor': Autor,
            'bkf-obra': Obra
        },
        
        data() {
            return {
                trechos: [],
                autores: [],
                obras:[]
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
                axios.get('http://localhost:9000/autores')
                    .then((resp) => {
                        this.erro = false;
                        this.autores = resp.data._embedded.autores;
                        console.log(resp)
                    })
                    .catch((err) => {
                        this.erro = true;
                        console.log(err)
                    });
                axios.get('http://localhost:9000/obras')
                    .then((resp) => {
                        this.erro = false;
                        this.obras = resp.data._embedded.obras;
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
        margin-top: 40px;
    }
    .bkf-header{
        margin: 40px;
    }
    
</style>

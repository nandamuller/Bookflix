<template>
    <md-whiteframe>
        <md-card class="bkf-conheca" style="min-height: 70vh;">
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
                    <h1>Conheça nossa Biblioteca</h1>
                </div>
                <div class="bkf-biblioteca" style="min-height: 70vh;">  
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
    </md-whiteframe>
</template>

<script>
</script>

<style>
    .bkf-conheca{
        margin:150px;
        margin-top: 0px;
    }
    .txt-bkf.conheca{
        font-size: 20px;
        line-height: 40px;
    }
    .bkf-biblioteca{
        margin-top: 100px;
    }
    .bkf-header{
        margin-top: 75px;
    }
    
</style>

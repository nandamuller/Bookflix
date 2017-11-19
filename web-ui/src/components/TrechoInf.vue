<template>
    <div class="trecho-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ trecho.conteudo }}"<br>
                      {{ trecho.autor }} em {{ trecho.obra }}
                </div>
              </md-card-content>
                <div class="trechobar-bkf" md-gutter>
                    <md-bottom-bar>
                        <router-link to="/trecho-info">
                            <md-bottom-bar-item md-icon="info outline" router-link to="/trecho-info">Info</md-bottom-bar-item>
                        </router-link>
                        <md-bottom-bar-item md-icon="near_me">Compartilhar</md-bottom-bar-item>
                    </md-bottom-bar>                    
                </div>
            </md-card>
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

</style>
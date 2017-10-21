<template>
    <md-whiteframe>
        <md-card class="bkf-conheca">
            <md-card-header>
                <md-card-header-text>
                    <div class="md-title">Cadastre-se</div>
                </md-card-header-text>
            </md-card-header>
            <md-card-content style="min-height: 70vh;">
               <form>
                    <div class="group">
                        <input type="text"><span class="highlight"></span><span class="bar"></span>
                        <label>Name</label>
                    </div>
                        <div class="group">
                            <input type="email"><span class="highlight"></span><span class="bar"></span>
                            <label>Email</label>
                        </div>
                        <div class="group">
                            <input type="password"><span class="highlight"></span><span class="bar"></span>
                            <label>Senha</label>
                        </div>
                          <button type="button" class="button buttonBlue">Cadastre-se
                            <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
                          </button>
                        </form>
            </md-card-content>
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
</style>

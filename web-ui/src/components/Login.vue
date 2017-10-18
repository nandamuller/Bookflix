<template>
     <md-whiteframe>
         <div class="login-bg" v-if="login.show">
    <div class="login-card-wide mdl-card mdl-shadow--2dp">
      <div class="mdl-card__title">
        <h2 class="mdl-card__title-text">Please Login</h2>
      </div>
      <div class="mdl-card__supporting-text">
        <div class="input-box">
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
            <input class="mdl-textfield__input" pattern="([A-Za-z0-9][-A-Za-z0-9]+\@)+([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}" v-model="login.username" type="text">
            <label class="mdl-textfield__label">E-mail</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
            <input class="mdl-textfield__input" v-model="login.password" type="password">
            <label class="mdl-textfield__label">Password</label>
          </div>
        </div>
      </div>
      <div class="mdl-card__actions mdl-card--border">
        <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" @click="showSign">
          Sign up
        </a>
         <a class="login-btn mdl-button mdl-button--colored mdl-js-button  mdl-button--raised mdl-js-ripple-effect" v-tap="logIn">
          Log in
        </a>
      </div>
    </div>
  </div>

  <div class="login-bg" v-if="sign.show">
    <div class="login-card-wide mdl-card mdl-shadow--2dp">
      <div class="mdl-card__title">
        <h2 class="mdl-card__title-text">Welcome to sign up</h2>
      </div>
      <div class="mdl-card__supporting-text">
        <div class="input-box">
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
            <input class="mdl-textfield__input" pattern="([A-Za-z0-9][-A-Za-z0-9]+\@)+([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}" v-model="sign.username" type="text">
            <label class="mdl-textfield__label">E-mail</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
            <input class="mdl-textfield__input" v-model="sign.password" type="password">
            <label class="mdl-textfield__label">Password</label>
          </div>
        </div>
      </div>
      <div class="mdl-card__actions mdl-card--border">
        <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" @click="showLogin">
          Log in
        </a>
         <a class="login-btn mdl-button mdl-button--colored mdl-js-button  mdl-button--raised mdl-js-ripple-effect" v-tap="Signup">
          Sign up
        </a>
      </div>
    </div>
  </div>
    </md-whiteframe>
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
    .bkf-conheca{
        margin:150px;
        margin-top: 0px;
    }
</style>
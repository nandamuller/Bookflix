<template>    
    <div class="autor-bkf">
        <md-card md-elevation="0">
              <md-card-content>
                  <div>"{{ autor.nome }}"</div>
              </md-card-content>
        </md-card>
    </div>
</template>

<script>
    
 export default { 
     name: 'Autor', 

     props: {
         autor: {
             type: Object,
             required: true
         }
     },
     
     created() {
         console.log(this.autor.id);
     },
     
  methods: {
  }
};
</script>

<style>
    autor-bkf{
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-autor-bkf{
        font-size: 24px;
    }
</style>

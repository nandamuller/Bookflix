<template>
<Trecho :id="trecho"></Trecho>
</template>

<script>
    import Trecho from '@/components/Trecho'
    
 export default {
     name: 'Logado',
     
  methods: {
    openDialog(ref) {
      this.$refs[ref].open();
    },
    closeDialog(ref) {
      this.$refs[ref].close();
    },
    onOpen() {
      console.log('Opened');
    },
    onClose(type) {
      console.log('Closed', type);
    }
  }
};
</script>

<style>
    .trecho-bkf{
        margin: 150px;
        margin-top: 0px;
        text-align: center; 
        width: 100%;
        font-size: 24px; 
    }
    .inf-trecho-bkf{
        font-size: 24px;
    }
</style>


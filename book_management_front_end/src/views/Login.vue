<template>
    <div  class="login_input1">
        <h1>请根据账号密码登录</h1>
        账号：<input class="login-input" type="text"  v-model="id" placeholder="请输入账号" ref="userId"><br>
        密码：<input class="login-input" type="password" v-model="pwd" placeholder="请输入密码" ref="userPwd"><br>
		<button @click="determine_login()">登录</button>
    </div>
</template>


<script>
    export default{
        name:"Login",
        data(){
            return {
                id:'',
                pwd:'',
               users:[
                   {
                       id:'016945',
                       name:'沫沫',
                       pwd:'123456'
                   }
               ]

            }
        },
        methods:{           
            determine_login(){
            for(var i=0;i<this.users.length;i++)
            {
                if(this.id==this.users[i].id&&this.pwd==this.users[i].pwd)
                alert("登录成功");
            }
        }
        },
        created(){
          /*初始化的  alert(123)*/
          const _this=this;
          this.axios.get('http://localhost:8083/user/findAll').then(function (resp){
              console.log(resp);
              _this.users=resp.data;
          });
        }
    }
   
</script>

<style scoped>

</style>

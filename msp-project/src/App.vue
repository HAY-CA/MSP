<<template>
    <div id="app">
       <div class="layui-layout layui-layout-admin" style="border-bottom: solid 5px #1aa094;">
            <NavHead></NavHead>
            <NavLeft></NavLeft>
            <MyConsole></MyConsole>
            <Mobile></Mobile>
       </div>
    </div>
  
</template>

<<script>
import NavHead from './components/NavHead.vue'
import NavLeft from './components/NavLeft.vue'
import MyConsole from './components/MyConsole.vue'
import Mobile from './components/Mobile.vue'

export default {
    components:{
        'NavHead' : NavHead,
        'NavLeft' : NavLeft,
        'MyConsole' : MyConsole,
        'Mobile' : Mobile
    }
}
</script>

<<style>

</style>


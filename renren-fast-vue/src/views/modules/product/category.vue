<template>
    <div>
        <el-tree :data="data" :props="defaultProps" @node-click="handleNodeClick"></el-tree>
    </div>
</template>

<script>
// 这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
// 例如：import 《组件名称》 from '《组件路径》'

export default {
    // import引入的组件需要注入到对象中才能使用
    data() {
        return {
            data: [],
            defaultProps: {
                children: 'children',
                label: 'label'
            }
        };
    },
    methods: {
        handleNodeClick(data) {
            console.log(data);
        },
        getMenus() {
            this.$http({
                url: this.$http.adornUrl('/producto/category/list/tree'),
                method: 'get',
            }).then( data => {
                console.log("成功获取到菜单数据...", data)
            })
        }
    },
    components: {},
    props: {},

    // 计算属性 类似于data概念
    computed: {},
    // 监控data中的数据变化
    watch: {},

    // 声明周期 - 创建完成（可以访问当前this实例）
    created() { 
        this.getMenus;
    },
    // 声明周期 - 挂载完成（可以访问DOM元素）
    mounted() { },
    beforeCreate() { }, // 生命周期 - 创建之前
    beforeMount() { }, // 生命周期 - 挂载之前
    beforeUpdate() { }, // 生命周期 - 更新之前
    updated() { }, // 生命周期 - 更新之后
    beforeDestroy() { }, // 生命周期 - 销毁之前
    destroyed() { }, // 生命周期 - 销毁完成
    activated() { } // 如果页面有keep-alive缓存功能，这个函数会触发
};
</script>
<style scoped></style>
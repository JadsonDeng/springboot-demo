<!-- layui lib -->
<#macro layui>
<link rel="stylesheet" href="lib/layui/css/layui.css">
<script src="lib/layui/layui.js" type="text/javascript"></script>
<script>
    layui.use(['layer', 'form', 'element'], function () {
        var layer = layui.layer,
                form = layui.form,
                element = layui.element;

        layer.msg('Hello World');
    });
</script>
</#macro>
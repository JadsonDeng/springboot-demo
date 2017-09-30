<html>
<#include "./common/common.ftl">
<header>
    <title>test</title>
<@layui></@layui>
</header>
<body>
<div class="layui-container">
    <div class="layui-col-md3" style="height: 100vh;">
        <ul class="layui-nav layui-nav-tree layui-bg-cyan layui-inline" lay-filter="demo">
            <li class="layui-nav-item layui-nav-itemed">
                <a href="javascript:;">默认展开</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">选项一</a></dd>
                    <dd><a href="javascript:;">选项二</a></dd>
                    <dd><a href="javascript:;">选项三</a></dd>
                    <dd><a href="">跳转项</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;">解决方案</a>
                <dl class="layui-nav-child">
                    <dd><a href="">移动模块</a></dd>
                    <dd><a href="">后台模版</a></dd>
                    <dd><a href="">电商平台</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">云市场</a></li>
            <li class="layui-nav-item"><a href="">社区</a></li>
        </ul>
    </div>
    <div class="layui-col-md9">
        <button class="layui-btn">一个标准的按钮</button>
        <a href="http://www.layui.com" class="layui-btn">一个可跳转的按钮</a>
        <#--Holle, ${user.userName},${user.password}-->
    </div>
</body>
</html>
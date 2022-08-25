<%@ page import="org.apache.shiro.subject.Subject" %>
<%@ page import="org.apache.shiro.SecurityUtils" %>
<%@ page import="com.lanou.entity.TbUser" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>比赛首页</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon"/>
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">

    <script src="js/jquery.min.js"></script>
    <script src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>

</head>
<body>
<!-- 顶部开始 -->
<div class="container">
    <div class="logo"><a href="index.html">管理</a></div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont">&#xe699;</i>
    </div>
    <ul class="layui-nav left fast-add" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">新增</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('资讯','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>资讯</a></dd>
                <dd><a onClick="x_admin_show('图片','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>图片</a></dd>
                <dd><a onClick="x_admin_show('用户','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>用户</a></dd>
            </dl>
        </li>
    </ul>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;" id="login-user">
                <shiro:principal property="account"/>
<%--                <%--%>
<%--                    Subject subject = SecurityUtils.getSubject();--%>
<%--                    TbUser u = (TbUser) subject.getPrincipal();--%>
<%--                    u.getAccount();--%>
<%--                    System.out.println(u.getAccount());--%>
<%--                %>--%>
<%--                ${tbUser.account()}--%>
            </a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
                <dd><a onClick="x_admin_show('个人信息','http://www.baidu.com')">个人信息</a></dd>
                <dd><a href="/user/logout">切换帐号</a></dd>
            </dl>
        </li>
    </ul>

</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <shiro:hasAnyRoles name="学生">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6eb;</i>
                    <cite>主页</cite>
                    <i class="iconfont nav_right">&#xe6a7;</i>
                </a>
                <ul class="sub-menu">
                    <li><a _href="html/welcome.html"><i class="iconfont">&#xe6a7;</i><cite>控制台</cite></a></li>
                </ul>
            </li>
            </shiro:hasAnyRoles>

<%--            <% if (u.getRole().getId() <= 1) {%>--%>
            <shiro:hasAnyRoles name="管理员,教学总监,讲师">
                <li>
                        <%--                <li class="needadmin" style="display: none">--%>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6e4;</i>
                        <cite>团队管理</cite>
                        <i class="iconfont nav_right">&#xe6a7;</i>
                    </a>
                    <ul class="sub-menu">
                        <li><a _href="html/clazz_list.html"><i class="iconfont">&#xe6a7;</i><cite>团队列表</cite></a></li>
<%--                        <li><a _href="html/unicode.html"><i class="iconfont">&#xe6a7;</i><cite>竞赛记录</cite></a></li>--%>

                    </ul>
                </li>
            </shiro:hasAnyRoles>
<%--            <%}%>--%>

            <shiro:hasAnyRoles name="管理员,教学总监">
                <li>
                    <a href="javascript:;"><i class="iconfont">&#xe6f6;</i><cite>评委</cite><i
                            class="iconfont nav_right">&#xe6a7;</i></a>
                    <ul class="sub-menu">
                        <li><a _href="html/teacher_list.html"><i class="iconfont">&#xe6a7;</i><cite>评委列表</cite></a></li>
                    </ul>
                </li>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="管理员,教学总监">
                <%--                <li class="needteacher" style="display: none">--%>
                <li>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6b4;</i>
                        <cite>成员管理</cite>
                        <i class="iconfont nav_right">&#xe6a7;</i>
                    </a>
                    <ul class="sub-menu">
                        <li><a _href="html/student_list.html"><i class="iconfont">&#xe6a7;</i><cite>成员列表</cite></a></li>
                    </ul>
                </li>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="管理员,教学总监,讲师">
                <li>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe69e;</i>
                        <cite>题库管理</cite>
                        <i class="iconfont nav_right">&#xe6a7;</i>
                    </a>
                    <ul class="sub-menu">

                        <li>
                            <a _href="html/question_choose_list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                <cite>单选题库</cite>
                            </a>
                        </li>

                        <li>
                            <a _href="html/question_judge_list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                <cite>判断题库</cite>
                            </a>
                        </li>
                        <li>
                            <a _href="html/question_code_list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                <cite>代码题库</cite>
                            </a>
                        </li>
                        <li>
                            <a _href="html/question_subjective_list.html">
                                <i class="iconfont">&#xe6a7;</i>
                                <cite>主观题库</cite>
                            </a>
                        </li>
                    </ul>
                </li>
            </shiro:hasAnyRoles>

            <shiro:hasAnyRoles name="管理员,教学总监,讲师">
                <li>
                        <%--                <li class="needadmin" style="display: none">--%>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6e4;</i>
                        <cite>竞赛管理</cite>
                        <i class="iconfont nav_right">&#xe6a7;</i>
                    </a>
                    <ul class="sub-menu">
<!-- <%--                        <li><a _href="html/exam_list.html"><i class="iconfont">&#xe6a7;</i><cite>竞赛记录</cite></a></li>--%> -->
                        <li><a _href="html/exam_list1.html"><i class="iconfont">&#xe6a7;</i><cite>竞赛记录(自动生成)</cite></a></li>
                        <li><a _href="html/achievement_list.html"><i class="iconfont">&#xe6a7;</i><cite>成绩统计</cite></a></li>
                    </ul>
                </li>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="学生">
                <li>
                        <%--                <li class="needadmin" style="display: none">--%>
                    <a href="javascript:;">
                        <i class="iconfont">&#xe6e4;</i>
                        <cite>我的竞赛</cite>
                        <i class="iconfont nav_right">&#xe6a7;</i>
                    </a>
                    <ul class="sub-menu">

                        <li><a _href="html/myexam_list.html"><i class="iconfont">&#xe6a7;</i><cite>竞赛记录</cite></a></li>

                    </ul>
                </li>
            </shiro:hasAnyRoles>
        </ul>
    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
        <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='html/welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- 底部开始 -->
<!--<div class="footer">
    <div class="copyright">Copyright ©2019 L-admin v2.3 All Rights Reserved</div>
</div>-->
<!-- 底部结束 -->
<style>
    .copyrights {
        text-indent: -9999px;
        height: 0;
        line-height: 0;
        font-size: 0;
        overflow: hidden;
    }
</style>
<div class="copyrights" id="links20210126">
    Collect from <a href="http://www.cssmoban.com/" title="网站模板">模板之家</a>
    <a href="https://www.chazidian.com/" title="查字典">查字典</a>
</div>
<script>

    // $.ajax({
    //     type: "post",
    //     url: "../user/queryMy",
    //     success: function (res) {
    //         if (res.status == 0) {
    //
    //             $("#login-user").text(res.data.user.account);
    //             switch (res.data.user.role.roleName) {
    //                 case "管理员":
    //                     $(".needadmin").attr("style", "display:block");
    //                 case "教学总监":
    //                     $(".needmanager").attr("style", "display:block");
    //                 case "带队人员":
    //                     $(".needteacher").attr("style", "display:block");
    //                 case "成员":
    //                     $(".needstudent").attr("style", "display:block");
    //             }
    //         } else {
    //             $(location).attr('href', 'login.html');
    //         }
    //         console.log(res);
    //         console.log(uid);
    //     }
    //
    // })

</script>
</body>
</html>
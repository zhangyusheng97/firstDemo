<style>
    * {
        margin: 0;
        padding: 0;
    }

    a:hover, a:focus {
        text-decoration: none
    }


    .mobile-nav ul li a {
        color: white;
        font-size: 1.0em;
        display: block;
        padding: 1em 15%;
        border-bottom: 1.2px solid #6E8B3D;
        transition: all 0.2s ease-out;
        cursor: pointer;
    }

    .mobile-nav {
        position: fixed;
        top: 0;
        left: 0;
        width: 180px;
        height: 100%;
        background-color: #70C570;
        z-index: 9999;
        transition: all 0.3s ease-in;
    }

    .mobile-nav ul li a:hover {
        background-color: #17A2B8;
        color: #ffffff;
    }

</style>

<div id="mobile-menu" class="mobile-nav ">
    <ul id="leftRoot">
        <li><a href="/wishbottle/first/list">首页</a></li>
        <li><a href="/wishbottle/admin/list">管理员设置</a></li>
        <li><a href="/wishbottle/treehole/list">树洞信息管理</a></li>
        <li><a href="/wishbottle/wishbottle/list">心愿瓶信息管理</a></li>
        <li><a href="/wishbottle/user/list">用户信息管理</a></li>
        <li><a href="/wishbottle/logoutAdmin">退出登陆</a></li>
    </ul>
</div>



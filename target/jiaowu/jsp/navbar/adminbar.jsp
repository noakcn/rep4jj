
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="sidebar" class="sidebar responsive">

    <c:if test="${role=='ADMIN'}">
        <ul class="nav nav-list">
            <li>
                <a href="/user/to/index.do">
                    <i class="menu-icon fa fa-tachometer"></i>
                    <span class="menu-text"> 首页 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-desktop"></i>
                    <span class="menu-text"> 信息查询 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">
                    <li class="">
                        <a href="#" class="dropdown-toggle">
                            <i class="menu-icon fa fa-caret-right"></i>
                            用户查询
                            <b class="arrow fa fa-angle-down"></b>
                        </a>

                        <b class="arrow"></b>

                        <ul class="submenu">
                            <li class="">
                                <a href="jsp/searchstudent.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    学生查询
                                </a>

                                <b class="arrow"></b>
                            </li>

                            <li class="">
                                <a href="jsp/searchteacher.jsp">
                                    <i class="menu-icon fa fa-caret-right"></i>
                                    教师查询
                                </a>

                                <b class="arrow"></b>
                            </li>
                        </ul>
                    </li>

                    <li class="">
                        <a href="jsp/searchchengji.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            成绩查询
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/kechengsearch.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            课程查询
                        </a>

                        <b class="arrow"></b>
                    </li>


                </ul>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-list"></i>
                    <span class="menu-text"> 信息录入 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">
                    <li class="">
                        <a href="jsp/instudent.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            学生信息
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/inteacher.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            教师信息
                        </a>

                        <b class="arrow"></b>
                    </li>

                </ul>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-pencil-square-o"></i>
                    <span class="menu-text"> 系统设置 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">
                    <li class="">
                        <a href="jsp/xueyuansetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            学院设置
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/zhuanyesetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            专业设置
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/banjisetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            班级设置
                        </a>
                        <b class="arrow"></b>
                    </li>
                    <li class="">
                        <a href="jsp/kechengsetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            课程设置
                        </a>
                        <b class="arrow"></b>
                    </li>

                </ul>
            </li>

            <li class="">
                <a href="/profile/to/page.do">
                    <i class="menu-icon fa fa-tag"></i>
                    <span class="menu-text">个人资料</span>
                </a>

            </li>

        </ul>
        <!-- /.nav-list -->
    </c:if>
    <c:if test="${role=='TEACHER'}">
        <ul class="nav nav-list">
            <li>
                <a href="/user/to/index.do">
                    <i class="menu-icon fa fa-tachometer"></i>
                    <span class="menu-text"> 首页 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-desktop"></i>
                    <span class="menu-text"> 信息查询 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">

                    <li class="">
                        <a href="jsp/searchstudent.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            学生查询
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/kechengsearch.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            课程查询
                        </a>

                        <b class="arrow"></b>
                    </li>
                </ul>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-list"></i>
                    <span class="menu-text"> 信息录入 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">

                    <li class="">
                        <a href="jsp/inchengji.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            成绩录入
                        </a>

                        <b class="arrow"></b>
                    </li>
                </ul>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-pencil-square-o"></i>
                    <span class="menu-text"> 系统设置 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">


                    <li class="">
                        <a href="jsp/banjisetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            班级设置
                        </a>
                        <b class="arrow"></b>
                    </li>
                    <li class="">
                        <a href="jsp/kechengsetting.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            课程设置
                        </a>
                        <b class="arrow"></b>
                    </li>

                </ul>
            </li>

            <li class="">
                <a href="jsp/calendar.jsp">
                    <i class="menu-icon fa fa-calendar"></i>
							<span class="menu-text">
								排课
							</span>
                </a>

            </li>


            <li class="">
                <a href="/profile/to/page.do">
                    <i class="menu-icon fa fa-tag"></i>
                    <span class="menu-text">个人资料</span>
                </a>

            </li>

        </ul>
        <!-- /.nav-list -->
    </c:if>
    <c:if test="${role=='STUDENT'}">
        <ul class="nav nav-list">
            <li>
                <a href="/user/to/index.do">
                    <i class="menu-icon fa fa-tachometer"></i>
                    <span class="menu-text"> 首页 </span>
                </a>

                <b class="arrow"></b>
            </li>

            <li class="">
                <a href="#" class="dropdown-toggle">
                    <i class="menu-icon fa fa-desktop"></i>
                    <span class="menu-text"> 信息查询 </span>

                    <b class="arrow fa fa-angle-down"></b>
                </a>

                <b class="arrow"></b>

                <ul class="submenu">

                    <li class="">
                        <a href="jsp/searchchengji.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            成绩查询
                        </a>

                        <b class="arrow"></b>
                    </li>

                    <li class="">
                        <a href="jsp/kechengsearch.jsp">
                            <i class="menu-icon fa fa-caret-right"></i>
                            课程查询
                        </a>

                        <b class="arrow"></b>
                    </li>


                </ul>
            </li>


            <li>
                <a href="jsp/xuanke.jsp">
                    <i class="menu-icon fa fa-list-alt"></i>
                    <span class="menu-text"> 选课 </span>
                </a>
            </li>


            <li class="">
                <a href="/profile/to/page.do">
                    <i class="menu-icon fa fa-tag"></i>
                    <span class="menu-text">个人资料</span>
                </a>

            </li>

        </ul>
        <!-- /.nav-list -->
    </c:if>
    <!-- #section:basics/sidebar.layout.minimize -->
    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left"
           data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

    <!-- /section:basics/sidebar.layout.minimize -->
    <script type="text/javascript">
        try {

            ace.settings.check('sidebar', 'collapsed')
        } catch (e) {
        }
    </script>

</div>

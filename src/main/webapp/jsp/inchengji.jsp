<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>Tables - Ace Admin</title>

    <meta name="description" content="Static &amp; Dynamic Tables"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0"/>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../assets/css/font-awesome.min.css"/>

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="../assets/css/jquery-ui.custom.min.css"/>
    <link rel="stylesheet" href="../assets/css/chosen.css"/>
    <link rel="stylesheet" href="../assets/css/datepicker.css"/>
    <link rel="stylesheet" href="../assets/css/bootstrap-timepicker.css"/>
    <link rel="stylesheet" href="../assets/css/daterangepicker.css"/>
    <link rel="stylesheet" href="../assets/css/bootstrap-datetimepicker.css"/>
    <link rel="stylesheet" href="../assets/css/colorpicker.css"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="../assets/css/ace-fonts.css"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="../assets/css/ace.min.css" id="main-ace-style"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="../assets/css/ace-part2.min.css"/>
    <![endif]-->
    <link rel="stylesheet" href="../assets/css/ace-skins.min.css"/>
    <link rel="stylesheet" href="../assets/css/ace-rtl.min.css"/>

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="../assets/css/ace-ie.min.css"/>
    <![endif]-->

    <!-- inline styles related to this page -->

    <!-- ace settings handler -->
    <script src="../assets/js/ace-extra.min.js"></script>

    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

    <!--[if lte IE 8]>
    <script src="../assets/js/html5shiv.min.js"></script>
    <script src="../assets/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->
<%@include file="navbar/head.jsp" %>


<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">

    <!-- #section:basics/sidebar -->
    <%@ include file="navbar/adminbar.jsp" %>


    <!-- /section:basics/sidebar -->
    <div class="main-content">
        <!-- #section:basics/content.breadcrumbs -->
        <div class="breadcrumbs" id="breadcrumbs">
            <script type="text/javascript">
                try {
                    ace.settings.check('breadcrumbs', 'fixed')
                } catch (e) {
                }
            </script>

            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Home</a>
                </li>

                <li>
                    <a href="#">Tables</a>
                </li>
                <li class="active">Simple &amp; Dynamic</li>
            </ul><!-- /.breadcrumb -->

            <!-- #section:basics/content.searchbox -->
            <div class="nav-search" id="nav-search">
                <form class="form-search">
							<span class="input-icon">
								<input type="text" placeholder="Search ..." class="nav-search-input"
                                       id="nav-search-input" autocomplete="off"/>
								<i class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
                </form>
            </div><!-- /.nav-search -->

            <!-- /section:basics/content.searchbox -->
        </div>

        <!-- /section:basics/content.breadcrumbs -->
        <div class="page-content">
            <!-- #section:settings.box -->
            <div class="ace-settings-container" id="ace-settings-container">
                <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                    <i class="ace-icon fa fa-cog bigger-150"></i>
                </div>

                <div class="ace-settings-box clearfix" id="ace-settings-box">
                    <div class="pull-left width-50">
                        <!-- #section:settings.skins -->
                        <div class="ace-settings-item">
                            <div class="pull-left">
                                <select id="skin-colorpicker" class="hide">
                                    <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                                    <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                                    <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                                    <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                                </select>
                            </div>
                            <span>&nbsp; Choose Skin</span>
                        </div>

                        <!-- /section:settings.skins -->

                        <!-- #section:settings.navbar -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar"/>
                            <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                        </div>

                        <!-- /section:settings.navbar -->

                        <!-- #section:settings.sidebar -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar"/>
                            <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                        </div>

                        <!-- /section:settings.sidebar -->

                        <!-- #section:settings.breadcrumbs -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs"/>
                            <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                        </div>

                        <!-- /section:settings.breadcrumbs -->

                        <!-- #section:settings.rtl -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl"/>
                            <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                        </div>

                        <!-- /section:settings.rtl -->

                        <!-- #section:settings.container -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container"/>
                            <label class="lbl" for="ace-settings-add-container">
                                Inside
                                <b>.container</b>
                            </label>
                        </div>

                        <!-- /section:settings.container -->
                    </div><!-- /.pull-left -->

                    <div class="pull-left width-50">
                        <!-- #section:basics/sidebar.options -->
                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover"/>
                            <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                        </div>

                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact"/>
                            <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                        </div>

                        <div class="ace-settings-item">
                            <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight"/>
                            <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                        </div>

                        <!-- /section:basics/sidebar.options -->
                    </div><!-- /.pull-left -->
                </div><!-- /.ace-settings-box -->
            </div>
            <!-- /.ace-settings-container -->

            <div class="page-content-area">
                <div class="page-header">
                    <h1>
                        查询学生
                    </h1>
                </div>
                <div class="row">
                    <div class="col-xs-12">

                        <sf:form enctype="multipart/form-data" class="form-horizontal" method="post"
                                 action="/search/find/student.do" modelAttribute="requestObject">
                            <div class="space-4"></div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">
                                    学院 </label>

                                <div class="col-sm-5">
                                    <select class="chosen-select" id="xueyuan_select" name="xueyuanId"
                                            data-placeholder="请选择学院" onchange="getZhuanye()">
                                        <option value=""></option>
                                    </select>
                                </div>
                            </div>
                            <div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">
                                    专业 </label>

                                <div class="col-sm-5">
                                    <select class="chosen-select" id="zhuanye_select" name="zhuanyeId"
                                            data-placeholder="请选择专业" onchange="getBanji()">
                                        <option value=""></option>
                                    </select>
                                </div>
                            </div>
                            <div class="space-4"></div>
                            <div class="form-group">
                            <label class="col-sm-3 control-label no-padding-right">
                                班级 </label>
                            <div class="col-sm-5">
                                <select class="chosen-select" id="banji_select" name="banjiId"
                                        data-placeholder="请选择班级" onchange="getKecheng()">
                                    <option value=""></option>
                                </select>
                            </div>
                        </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">
                                    课程 </label>
                                <div class="col-sm-5">
                                    <select class="chosen-select" id="banji_select" name="kechengId"
                                            data-placeholder="请选择课程">
                                        <option value=""></option>
                                    </select>
                                </div>
                            </div>
                            <div class="space-4"></div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 姓名 </label>

                                <div class="col-sm-9">
                                    <input type="text" id="form-field-1" name="xingming" placeholder="姓名"
                                           class="col-xs-10 col-sm-5">
                                </div>
                            </div>
                            <div class="clearfix form-actions">
                                <div class="col-md-offset-3 col-md-9">
                                    <button class="btn btn-info" type="submit">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        查询
                                    </button>
                                </div>
                            </div>
                        </sf:form>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div>
            <!-- /section:settings.box -->
            <div class="page-content-area">

                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <div class="row">
                            <div class="col-xs-12">
                                <table id="sample-table-1" class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>
                                            <i class="ace-icon fa fa-user"></i>
                                            姓名
                                        </th>
                                        <th>
                                            <i>#</i>
                                            学号
                                        </th>
                                        <th>
                                            <i class="ace-icon fa fa-leaf"></i>
                                            班级
                                        </th>
                                        <th>
                                            <i class="ace-icon fa fa-book"></i>
                                            课程
                                        </th>
                                        <th>
                                            <i class="ace-icon fa fa-wrench  bigger-110 icon-only"></i>
                                            成绩
                                        </th>

                                    </tr>
                                    </thead>

                                    <tbody>
                                    <c:if test="${xueshengList!=null}">
                                        <c:forEach items="${xueshengList}" var="t">
                                            <tr>
                                                <td>
                                                        ${t.xingming}
                                                </td>
                                                <td>${t.xuehao}</td>
                                                <td>${t.mingcheng}</td>
                                                <td>
                                                    <div class="hidden-sm hidden-xs btn-group">
                                                        <button class="btn btn-xs btn-success">
                                                            <a href="/search/to/update/student.do?id=${t.userId}" class="tooltip-info"
                                                               data-rel="tooltip" title=""
                                                               data-original-title="确定">
                                                                <span class="white">
																	<i class="ace-icon fa fa-pencil bigger-120"></i>
																</span>
                                                            </a>

                                                        </button>

                                                    </div>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </c:if>

                                    </tbody>
                                </table>
                            </div><!-- /.span -->
                        </div><!-- /.row -->
                    </div><!-- /.row -->
                </div><!-- /.page-content-area -->
            </div><!-- /.page-content -->
        </div><!-- /.main-content -->

        <div class="footer">
            <div class="footer-inner">
                <!-- #section:basics/footer -->
                <div class="footer-content">
    <span class="bigger-120">
    <span class="blue bolder">Ace</span>
    Application &copy; 2013-2014
    </span>

                    &nbsp; &nbsp;
    <span class="action-buttons">
    <a href="#">
        <i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
    </a>

    <a href="#">
        <i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
    </a>

    <a href="#">
        <i class="ace-icon fa fa-rss-square orange bigger-150"></i>
    </a>
    </span>
                </div>

                <!-- /section:basics/footer -->
            </div>
        </div>

        <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
            <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
        </a>
    </div><!-- /.main-container -->

    <!-- basic scripts -->

    <!--[if !IE]> -->
    <script type="text/javascript">
        window.jQuery || document.write("<script src='../assets/js/jquery.min.js'>" + "<" + "/script>");
    </script>

    <!-- <![endif]-->

    <!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='../assets/js/jquery1x.min.js'>" + "<" + "/script>");
    </script>
    <![endif]-->
    <script type="text/javascript">
        if ('ontouchstart' in document.documentElement) document.write("<script src='../assets/js/jquery.mobile.custom.min.js'>" + "<" + "/script>");
    </script>
    <script src="../assets/js/bootstrap.min.js"></script>
    <!-- page specific plugin scripts -->

    <!--[if lte IE 8]>
    <script src="../assets/js/excanvas.min.js"></script>
    <![endif]-->
    <script src="../assets/js/jquery-ui.custom.min.js"></script>
    <script src="../assets/js/jquery.ui.touch-punch.min.js"></script>
    <script src="../assets/js/chosen.jquery.min.js"></script>

    <script src="../assets/js/fuelux/fuelux.spinner.min.js"></script>
    <script src="../assets/js/date-time/bootstrap-datepicker.min.js"></script>
    <script src="../assets/js/date-time/bootstrap-timepicker.min.js"></script>
    <script src="../assets/js/date-time/moment.min.js"></script>
    <script src="../assets/js/date-time/daterangepicker.min.js"></script>
    <script src="../assets/js/date-time/bootstrap-datetimepicker.min.js"></script>
    <script src="../assets/js/bootstrap-colorpicker.min.js"></script>
    <script src="../assets/js/jquery.knob.min.js"></script>
    <script src="../assets/js/jquery.autosize.min.js"></script>
    <script src="../assets/js/jquery.inputlimiter.1.3.1.min.js"></script>
    <script src="../assets/js/jquery.maskedinput.min.js"></script>
    <script src="../assets/js/bootstrap-tag.min.js"></script>
    <script src="../assets/js/typeahead.jquery.min.js"></script>

    <!-- ace scripts -->
    <script src="../assets/js/ace-elements.min.js"></script>
    <script src="../assets/js/ace.min.js"></script>
    <!-- page specific plugin scripts -->
    <script src="../assets/js/jquery.dataTables.min.js"></script>
    <script src="../assets/js/jquery.dataTables.bootstrap.js"></script>


    <!-- inline scripts related to this page -->
    <script type="text/javascript">

        jQuery(function ($) {
            var oTable1 =
                    $('#sample-table-2')
                    //.wrap("<div class='dataTables_borderWrap' />") //if you are applying horizontal scrolling (sScrollX)
                            .dataTable({
                                bAutoWidth: false,
                                "aoColumns": [
                                    {"bSortable": false},
                                    null, null, null, null, null,
                                    {"bSortable": false}
                                ],
                                "aaSorting": []
                            });


            $('.chosen-select').chosen({allow_single_deselect: true});
            //resize the chosen on window resize

            $(window)
                    .off('resize.chosen')
                    .on('resize.chosen', function () {
                        $('.chosen-select').each(function () {
                            var $this = $(this);
                            $this.next().css({'width': $this.parent().width()});
                        })
                    }).trigger('resize.chosen');
            $(document).on('click', 'th input:checkbox', function () {
                var that = this;
                $(this).closest('table').find('tr > td:first-child input:checkbox')
                        .each(function () {
                            this.checked = that.checked;
                            $(this).closest('tr').toggleClass('selected');
                        });
            });


            $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
            function tooltip_placement(context, source) {
                var $source = $(source);
                var $parent = $source.closest('table')
                var off1 = $parent.offset();
                var w1 = $parent.width();

                var off2 = $source.offset();
                //var w2 = $source.width();

                if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2)) return 'right';
                return 'left';
            }

            $.ajax({
                url: "setting/xueyuan/get/list.do",
                success: function (data) {
                    console.log(data);
                    $("#xueyuan_select").append(data);
                    $("#xueyuan_select").trigger("chosen:updated");
                    $('#xueyuan_select').chosen({allow_single_deselect: true});
                    $("#xueyuan_select")
                            .off('resize.chosen')
                            .on('resize.chosen', function () {
                                $('.chosen-select').each(function () {
                                    var $this = $(this);
                                    $this.next().css({'width': $this.parent().width()});
                                })
                            }).trigger('resize.chosen');
                }
            });


        });
        $('#id-input-file-2').ace_file_input({
            no_file: 'No File ...',
            btn_choose: 'Choose',
            btn_change: 'Change',
            droppable: false,
            onchange: null,
            thumbnail: false
        });
        function getZhuanye() {
            var id = $("#xueyuan_select option:selected").val();
            $.ajax({
                url: "setting/zhuanye/get/list.do?id=" + id,
                success: function (data) {
                    console.log(data);
                    $("#zhuanye_select option").remove();
                    $("#zhuanye_select").append(data);
                    $("#zhuanye_select").trigger("chosen:updated");
                    $('#zhuanye_select').chosen({allow_single_deselect: true});
                    $("#zhuanye_select")
                            .off('resize.chosen')
                            .on('resize.chosen', function () {
                                $('#zhuanye_select').each(function () {
                                    var $this = $(this);
                                    $this.next().css({'width': $this.parent().width()});
                                })
                            }).trigger('resize.chosen');
                }
            });

        }
        ;
        function getBanji() {
            var id = $("#zhuanye_select option:selected").val();
            $.ajax({
                url: "setting/banji/get/list.do?id=" + id,
                success: function (data) {
                    console.log(data);
                    $("#banji_select option").remove();
                    $("#banji_select").append(data);
                    $("#banji_select").trigger("chosen:updated");
                    $('#banji_select').chosen({allow_single_deselect: true});
                    $("#banji_select")
                            .off('resize.chosen')
                            .on('resize.chosen', function () {
                                $('#zhuanye_select').each(function () {
                                    var $this = $(this);
                                    $this.next().css({'width': $this.parent().width()});
                                })
                            }).trigger('resize.chosen');
                }
            });
        }
        ;
        function getKecheng() {
            var id = $("#zhuanye_select option:selected").val();
            $.ajax({
                url: "setting/banji/get/list.do?id=" + id,
                success: function (data) {
                    console.log(data);
                    $("#banji_select option").remove();
                    $("#banji_select").append(data);
                    $("#banji_select").trigger("chosen:updated");
                    $('#banji_select').chosen({allow_single_deselect: true});
                    $("#banji_select")
                            .off('resize.chosen')
                            .on('resize.chosen', function () {
                                $('#zhuanye_select').each(function () {
                                    var $this = $(this);
                                    $this.next().css({'width': $this.parent().width()});
                                })
                            }).trigger('resize.chosen');
                }
            });
        }
        ;
    </script>
    <!-- the following scripts are used in demo only for onpage help and you don't need them -->
    <link rel="stylesheet" href="../assets/css/ace.onpage-help.css"/>
    <link rel="stylesheet" href="../docs/assets/js/themes/sunburst.css"/>

    <script type="text/javascript"> ace.vars['base'] = '..'; </script>
    <script src="../assets/js/ace/elements.onpage-help.js"></script>
    <script src="../assets/js/ace/ace.onpage-help.js"></script>
    <script src="../docs/assets/js/rainbow.js"></script>
    <script src="../docs/assets/js/language/generic.js"></script>
    <script src="../docs/assets/js/language/html.js"></script>
    <script src="../docs/assets/js/language/css.js"></script>
    <script src="../docs/assets/js/language/javascript.js"></script>
</body>
</html>

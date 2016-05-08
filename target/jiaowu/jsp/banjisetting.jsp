<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%><!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="utf-8"/>
    <title>Form Elements - Ace Admin</title>
    <base href="<%=basePath%>">
    <meta name="description" content="Common form elements and layouts"/>
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
                    <a href="#">Forms</a>
                </li>
                <li class="active">Form Elements</li>
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
            </div><!-- /.ace-settings-container -->

            <!-- /section:settings.box -->
            <div class="page-content-area">
                <div class="page-header">
                    <h1>
                        专业设置
                    </h1>
                </div><!-- /.page-header -->

                <div class="row">
                    <div class="col-xs-12">
                        <c:if test="${result=='success'}">
                            <div class="alert alert-block alert-success">
                                <button type="button" class="close" data-dismiss="alert">
                                    <i class="ace-icon fa fa-times"></i>
                                </button>
                                <p>
                                    <strong>
                                        <i class="ace-icon fa fa-check"></i>
                                            ${mingcheng},${msg}
                                    </strong>
                                </p>
                            </div>
                        </c:if>
                        <c:if test="${result=='fail'}">
                            <div class="alert alert-danger">
                                <button type="button" class="close" data-dismiss="alert">
                                    <i class="ace-icon fa fa-times"></i>
                                </button>

                                <strong>
                                    <i class="ace-icon fa fa-times"></i>
                                    添加失败，${msg}
                                </strong>
                                <br>
                            </div>
                        </c:if>
                        <sf:form class="form-horizontal" action="setting/banji/setting.do"
                                 modelAttribute="requestObject">
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
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right">
                                    专业 </label>

                                <div class="col-sm-5">
                                    <select class="chosen-select" id="zhuanye_select" name="zhuanyeId"
                                            data-placeholder="请选择专业">
                                        <option value=""></option>
                                    </select>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 年级
                                </label>
                                <div class="col-sm-5">
                                    <div class="row">
                                        <div class="col-xs-8 col-sm-11">
                                            <div class="input-group">
                                                <input class="form-control date-picker" id="id-date-picker-1"
                                                       type="text"  name="nianji">
																	<span class="input-group-addon">
																		<i class="fa fa-calendar bigger-110"></i>
																	</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label no-padding-right" for="form-field-1"> 班级名称
                                </label>
                                <div class="col-sm-9">
                                    <input type="text" id="form-field-1" placeholder="名称"
                                           class="col-xs-9 col-sm-6" name="mingcheng"/>
                                </div>
                            </div>
                            <div class="space-4"></div>

                            <div class="clearfix form-actions">
                                <div class="col-md-offset-3 col-md-9">
                                    <button class="btn btn-info" type="submit">
                                        <i class="ace-icon fa fa-check bigger-110"></i>
                                        添加
                                    </button>
                                    &nbsp; &nbsp; &nbsp;
                                    <button class="btn" type="reset">
                                        <i class="ace-icon fa fa-undo bigger-110"></i>
                                        重置
                                    </button>
                                </div>
                            </div>
                        </sf:form>

                    </div><!-- /.col -->
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

<!-- inline scripts related to this page -->
<script type="text/javascript">
    jQuery(function ($) {
        $('#id-disable-check').on('click', function () {
            var inp = $('#form-input-readonly').get(0);
            if (inp.hasAttribute('disabled')) {
                inp.setAttribute('readonly', 'true');
                inp.removeAttribute('disabled');
                inp.value = "This text field is readonly!";
            }
            else {
                inp.setAttribute('disabled', 'disabled');
                inp.removeAttribute('readonly');
                inp.value = "This text field is disabled!";
            }
        });


        $('[data-rel=tooltip]').tooltip({container: 'body'});
        $('[data-rel=popover]').popover({container: 'body'});

        $('textarea[class*=autosize]').autosize({append: "\n"});
        $('textarea.limited').inputlimiter({
            remText: '%n character%s remaining...',
            limitText: 'max allowed : %n.'
        });

        $.mask.definitions['~'] = '[+-]';
        $('.input-mask-date').mask('99/99/9999');
        $('.input-mask-phone').mask('(999) 999-9999');
        $('.input-mask-eyescript').mask('~9.99 ~9.99 999');
        $(".input-mask-product").mask("a*-999-a999", {
            placeholder: " ", completed: function () {
                alert("You typed the following: " + this.val());
            }
        });


        $("#input-size-slider").css('width', '200px').slider({
            value: 1,
            range: "min",
            min: 1,
            max: 8,
            step: 1,
            slide: function (event, ui) {
                var sizing = ['', 'input-sm', 'input-lg', 'input-mini', 'input-small', 'input-medium', 'input-large', 'input-xlarge', 'input-xxlarge'];
                var val = parseInt(ui.value);
                $('#form-field-4').attr('class', sizing[val]).val('.' + sizing[val]);
            }
        });

        $("#input-span-slider").slider({
            value: 1,
            range: "min",
            min: 1,
            max: 12,
            step: 1,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $('#form-field-5').attr('class', 'col-xs-' + val).val('.col-xs-' + val);
            }
        });


        //"jQuery UI Slider"
        //range slider tooltip example
        $("#slider-range").css('height', '200px').slider({
            orientation: "vertical",
            range: true,
            min: 0,
            max: 100,
            values: [17, 67],
            slide: function (event, ui) {
                var val = ui.values[$(ui.handle).index() - 1] + "";

                if (!ui.handle.firstChild) {
                    $("<div class='tooltip right in' style='display:none;left:16px;top:-6px;'><div class='tooltip-arrow'></div><div class='tooltip-inner'></div></div>")
                            .prependTo(ui.handle);
                }
                $(ui.handle.firstChild).show().children().eq(1).text(val);
            }
        }).find('a').on('blur', function () {
            $(this.firstChild).hide();
        });


        $("#slider-range-max").slider({
            range: "max",
            min: 1,
            max: 10,
            value: 2
        });

        $("#slider-eq > span").css({width: '90%', 'float': 'left', margin: '15px'}).each(function () {
            // read initial values from markup and remove that
            var value = parseInt($(this).text(), 10);
            $(this).empty().slider({
                value: value,
                range: "min",
                animate: true

            });
        });

        $("#slider-eq > span.ui-slider-purple").slider('disable');//disable third item


        $('#id-input-file-1 , #id-input-file-2').ace_file_input({
            no_file: 'No File ...',
            btn_choose: 'Choose',
            btn_change: 'Change',
            droppable: false,
            onchange: null,
            thumbnail: false //| true | large
            //whitelist:'gif|png|jpg|jpeg'
            //blacklist:'exe|php'
            //onchange:''
            //
        });
        //pre-show a file name, for example a previously selected file
        //$('#id-input-file-1').ace_file_input('show_file_list', ['myfile.txt'])


        $('#id-input-file-3').ace_file_input({
            style: 'well',
            btn_choose: 'Drop files here or click to choose',
            btn_change: null,
            no_icon: 'ace-icon fa fa-cloud-upload',
            droppable: true,
            thumbnail: 'small'//large | fit
            //,icon_remove:null//set null, to hide remove/reset button
            /**,before_change:function(files, dropped) {
						//Check an example below
						//or examples/file-upload.html
						return true;
					}*/
            /**,before_remove : function() {
						return true;
					}*/
            ,
            preview_error: function (filename, error_code) {
                //name of the file that failed
                //error_code values
                //1 = 'FILE_LOAD_FAILED',
                //2 = 'IMAGE_LOAD_FAILED',
                //3 = 'THUMBNAIL_FAILED'
                //alert(error_code);
            }

        }).on('change', function () {
            //console.log($(this).data('ace_input_files'));
            //console.log($(this).data('ace_input_method'));
        });


        //dynamically change allowed formats by changing allowExt && allowMime function
        $('#id-file-format').removeAttr('checked').on('change', function () {
            var whitelist_ext, whitelist_mime;
            var btn_choose
            var no_icon
            if (this.checked) {
                btn_choose = "Drop images here or click to choose";
                no_icon = "ace-icon fa fa-picture-o";

                whitelist_ext = ["jpeg", "jpg", "png", "gif", "bmp"];
                whitelist_mime = ["image/jpg", "image/jpeg", "image/png", "image/gif", "image/bmp"];
            }
            else {
                btn_choose = "Drop files here or click to choose";
                no_icon = "ace-icon fa fa-cloud-upload";

                whitelist_ext = null;//all extensions are acceptable
                whitelist_mime = null;//all mimes are acceptable
            }
            var file_input = $('#id-input-file-3');
            file_input
                    .ace_file_input('update_settings',
                            {
                                'btn_choose': btn_choose,
                                'no_icon': no_icon,
                                'allowExt': whitelist_ext,
                                'allowMime': whitelist_mime
                            })
            file_input.ace_file_input('reset_input');

            file_input
                    .off('file.error.ace')
                    .on('file.error.ace', function (e, info) {
                        //console.log(info.file_count);//number of selected files
                        //console.log(info.invalid_count);//number of invalid files
                        //console.log(info.error_list);//a list of errors in the following format

                        //info.error_count['ext']
                        //info.error_count['mime']
                        //info.error_count['size']

                        //info.error_list['ext']  = [list of file names with invalid extension]
                        //info.error_list['mime'] = [list of file names with invalid mimetype]
                        //info.error_list['size'] = [list of file names with invalid size]


                        /**
                         if( !info.dropped ) {
							//perhapse reset file field if files have been selected, and there are invalid files among them
							//when files are dropped, only valid files will be added to our file array
							e.preventDefault();//it will rest input
						}
                         */


                        //if files have been selected (not dropped), you can choose to reset input
                        //because browser keeps all selected files anyway and this cannot be changed
                        //we can only reset file field to become empty again
                        //on any case you still should check files with your server side script
                        //because any arbitrary file can be uploaded by user and it's not safe to rely on browser-side measures
                    });

        });

        $('#spinner1').ace_spinner({
                    value: 0,
                    min: 0,
                    max: 200,
                    step: 10,
                    btn_up_class: 'btn-info',
                    btn_down_class: 'btn-info'
                })
                .on('change', function () {
                    //alert(this.value)
                });
        $('#spinner2').ace_spinner({
            value: 0,
            min: 0,
            max: 10000,
            step: 100,
            touch_spinner: true,
            icon_up: 'ace-icon fa fa-caret-up',
            icon_down: 'ace-icon fa fa-caret-down'
        });
        $('#spinner3').ace_spinner({
            value: 0,
            min: -100,
            max: 100,
            step: 10,
            on_sides: true,
            icon_up: 'ace-icon fa fa-plus smaller-75',
            icon_down: 'ace-icon fa fa-minus smaller-75',
            btn_up_class: 'btn-success',
            btn_down_class: 'btn-danger'
        });

        //datepicker plugin
        //link
        $('.date-picker').datepicker({
                    autoclose: true,
                    format:'yyyy',
                    viewMode:'years',
                    minViewMode: 'years',

                })
                //show datepicker when clicking on the icon
                .next().on(ace.click_event, function () {
            $(this).prev().focus();
        });

        //or change it into a date range picker
        $('.input-daterange').datepicker({autoclose: true});


        //to translate the daterange picker, please copy the "examples/daterange-fr.js" contents here before initialization
        $('input[name=date-range-picker]').daterangepicker({
                    'applyClass': 'btn-sm btn-success',
                    'cancelClass': 'btn-sm btn-default',
                    locale: {
                        applyLabel: 'Apply',
                        cancelLabel: 'Cancel',
                    }
                })
                .prev().on(ace.click_event, function () {
            $(this).next().focus();
        });


        $('#timepicker1').timepicker({
            minuteStep: 1,
            showSeconds: true,
            showMeridian: false
        }).next().on(ace.click_event, function () {
            $(this).prev().focus();
        });

        $('#date-timepicker1').datetimepicker().next().on(ace.click_event, function () {
            $(this).prev().focus();
        });


        $('#colorpicker1').colorpicker();

        $('#simple-colorpicker-1').ace_colorpicker();
        //$('#simple-colorpicker-1').ace_colorpicker('pick', 2);//select 2nd color
        //$('#simple-colorpicker-1').ace_colorpicker('pick', '#fbe983');//select #fbe983 color
        //var picker = $('#simple-colorpicker-1').data('ace_colorpicker')
        //picker.pick('red', true);//insert the color if it doesn't exist


        $(".knob").knob();


        var tag_input = $('#form-field-tags');
        try {
            tag_input.tag(
                    {
                        placeholder: tag_input.attr('placeholder'),
                        //enable typeahead by specifying the source array
                        source: ace.vars['US_STATES'],//defined in ace.js >> ace.enable_search_ahead
                        /**
                         //or fetch data from database, fetch those that match "query"
                         source: function(query, process) {
						  $.ajax({url: 'remote_source.php?q='+encodeURIComponent(query)})
						  .done(function(result_items){
							process(result_items);
						  });
						}
                         */
                    }
            )

            //programmatically add a new
            var $tag_obj = $('#form-field-tags').data('tag');
            $tag_obj.add('Programmatically Added');
        }
        catch (e) {
            //display a textarea for old IE, because it doesn't support this plugin or another one I tried!
            tag_input.after('<textarea id="' + tag_input.attr('id') + '" name="' + tag_input.attr('name') + '" rows="3">' + tag_input.val() + '</textarea>').remove();
            //$('#form-field-tags').autosize({append: "\n"});
        }


        //////////

        //typeahead.js
        //example taken from plugin's page at: https://twitter.github.io/typeahead.js/examples/
        var substringMatcher = function (strs) {
            return function findMatches(q, cb) {
                var matches, substringRegex;

                // an array that will be populated with substring matches
                matches = [];

                // regex used to determine if a string contains the substring `q`
                substrRegex = new RegExp(q, 'i');

                // iterate through the pool of strings and for any string that
                // contains the substring `q`, add it to the `matches` array
                $.each(strs, function (i, str) {
                    if (substrRegex.test(str)) {
                        // the typeahead jQuery plugin expects suggestions to a
                        // JavaScript object, refer to typeahead docs for more info
                        matches.push({value: str});
                    }
                });

                cb(matches);
            }
        }

        $('input.typeahead').typeahead({
            hint: true,
            highlight: true,
            minLength: 1
        }, {
            name: 'states',
            displayKey: 'value',
            source: substringMatcher(ace.vars['US_STATES'])
        });


        /////////
        $('#modal-form input[type=file]').ace_file_input({
            style: 'well',
            btn_choose: 'Drop files here or click to choose',
            btn_change: null,
            no_icon: 'ace-icon fa fa-cloud-upload',
            droppable: true,
            thumbnail: 'large'
        })

        //chosen plugin inside a modal will have a zero width because the select element is originally hidden
        //and its width cannot be determined.
        //so we set the width after modal is show
        $('#modal-form').on('shown.bs.modal', function () {
            $(this).find('.chosen-container').each(function () {
                $(this).find('a:first-child').css('width', '210px');
                $(this).find('.chosen-drop').css('width', '210px');
                $(this).find('.chosen-search input').css('width', '200px');
            });
        })
        /**
         //or you can activate the chosen plugin after modal is shown
         //this way select element becomes visible with dimensions and chosen works as expected
         $('#modal-form').on('shown', function () {
					$(this).find('.modal-chosen').chosen();
				})
         */
        $.ajax({
            url: "setting/xueyuan/get/list.do",
            success: function (data) {
                console.log(data);
                $("#xueyuan_select").append(data);
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

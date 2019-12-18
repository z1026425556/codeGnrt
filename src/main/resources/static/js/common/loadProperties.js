function loadProp(fileName, propName){

    var propValue = null;

    jQuery.i18n.properties({// 加载properties文件
        name : fileName, // properties文件名称(不包含.properties，例：web-front)
        path : '../../config/', // properties文件路径
        mode : 'map', // 用 Map 的方式使用资源文件中的值
        callback : function() {// 加载成功后设置显示内容
            // alert($.i18n.prop("baiduMap_scretKey"));//其中isp_index为properties文件中需要查找到的数据的key值
            propValue = $.i18n.prop(propName);
        }
    });

    return propValue;

}
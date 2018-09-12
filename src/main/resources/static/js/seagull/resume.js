var columnDefs = [{"title": "#","targets": 0},
				  {"title": "Họ tên","targets": 1},
				  {"title": "Quan hệ","targets": 2},
				  {"title": "Nghề nghiệp","targets": 3},
				  {"title": "Điện thoại","targets": 4},
				  {"title": "Địa chỉ","targets": 5},
				  {"title": "Ghi Chú","targets": 6}];

var aoColumns = [{ "mData": null},
			     { "mData": "hoten", "defaultContent":"" },
			  	 { "mData": "quanhe", "defaultContent":"" },
				 { "mData": "nghenghiep", "defaultContent":"" },
				 { "mData": "dienthoai", "defaultContent":"" },
				 { "mData": "diachi", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" }];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "thongtingiadinh/" + 8   ;
    
	var table = $('#xtable').DataTable({
				//dom: "Blfrtip",
				//buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "paging":         false,
			    "autoWidth": true,
			    "ordering": false,
                "scrollX":  true,
                "searching": false,
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": columnDefs,
				"aoColumns": aoColumns
		 });
		table.columns.adjust().draw();
	
	 //$('#xtable').css('width', '100%').dataTable().fnAdjustColumnSizing();
});


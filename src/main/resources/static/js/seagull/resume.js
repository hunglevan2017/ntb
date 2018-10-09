var columnDefs = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Họ tên","targets": 2,"width":"15%"},
				  {"title": "Quan hệ","targets": 3},
				  {"title": "Nghề nghiệp","targets": 4},
				  {"title": "Điện thoại","targets": 5},
				  {"title": "Địa chỉ","targets": 6},
				  {
					  "title": "",
					  "targets": 7,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs information-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 8,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs information-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "hoten", "defaultContent":"" },
			  	 { "mData": "text", "defaultContent":"" },
				 { "mData": "nghenghiep", "defaultContent":"" },
				 { "mData": "dienthoai", "defaultContent":"" },
				 { "mData": "diachi", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "thongtingiadinh/" + $('#thuyenvienId').val()   ;
    
	
	var table = $('#xtable').DataTable({
				//dom: "Blfrtip",
				//buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "scrollY": "300px",
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
		
		
		var url = page_context + 'editInformationFamily/';
		initEventClickForEditOrDelete("xtable",".information-edit",url);
		
		
		url = page_context + 'deleteInformationFamily/';
		initEventClickForEditOrDelete("xtable",".information-delete",url);
		
	
	
		
});


var columnDefs_03 = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Tên phần mềm","targets": 2,"width":"15%"},
				  {"title": "Xếp loại","targets": 3},
				  {"title": "Ghi Chú","targets": 4},
				  {
					  "title": "",
					  "targets": 5,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdovitinh-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 6,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdovitinh-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_03 = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			  	 { "mData": "tenphanmem", "defaultContent":"" },
			     { "mData": "text", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "trinhdovitinh/" + $('#thuyenvienId').val()   ;
    
	var nameTable_03 = "xtable_trinhdovitinh";
	
	var table = $('#' + nameTable_03).DataTable({
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
                "columnDefs": columnDefs_03,
				"aoColumns": aoColumns_03
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editTrinhDoViTinh/';
		initEventClickForEditOrDelete(nameTable_03,".trinhdovitinh-edit",url);
		
		
		url = page_context + 'deleteTrinhDoViTinh/';
		initEventClickForEditOrDelete(nameTable_03,".trinhdovitinh-delete",url);
		
		
});


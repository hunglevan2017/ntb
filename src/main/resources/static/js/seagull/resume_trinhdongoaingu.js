var columnDefs_02 = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Ngoại ngữ","targets": 2,"width":"15%"},
				  {"title": "Nghe","targets": 3},
				  {"title": "Nói","targets": 4},
				  {"title": "Đọc","targets": 5},
				  {"title": "Viết","targets": 6},
				  {"title": "Ghi Chú","targets": 7},
				  {
					  "title": "",
					  "targets": 8,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdongoaingu-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 9,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdongoaingu-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_02 = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "text", "defaultContent":"" },
			  	 { "mData": "nghe", "defaultContent":"" },
				 { "mData": "noi", "defaultContent":"" },
				 { "mData": "doc", "defaultContent":"" },
				 { "mData": "viet", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "trinhdongoaingu/" + $('#thuyenvienId').val()   ;
    
	var nameTable_02 = "xtable_trinhdongoaingu";
	
	var table = $('#' + nameTable_02).DataTable({
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
                "columnDefs": columnDefs_02,
				"aoColumns": aoColumns_02
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editTrinhDoNgoaiNgu/';
		initEventClickForEditOrDelete(nameTable_02,".trinhdongoaingu-edit",url);
		
		
		url = page_context + 'deleteTrinhDoNgoaiNgu/';
		initEventClickForEditOrDelete(nameTable_02,".trinhdongoaingu-delete",url);
		
	
	
		
});


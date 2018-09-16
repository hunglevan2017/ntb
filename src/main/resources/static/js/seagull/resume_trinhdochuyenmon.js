var columnDefs_01 = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "Năm bắt đầu","targets": 2,"width":"15%"},
				  {"title": "Năm tốt nghiệp","targets": 3},
				  {"title": "Bằng cấp (đại học hoặc khác)","targets": 4},
				  {"title": "Chuyên ngành","targets": 5},
				  {"title": "Trường đào tạo","targets": 6},
				  {"title": "Xếp loại","targets": 7},
				  {
					  "title": "",
					  "targets": 8,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdochuyenmon-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 9,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdochuyenmon-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_01 = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "tungay", "defaultContent":"" },
			  	 { "mData": "denngay", "defaultContent":"" },
				 { "mData": "bangcap", "defaultContent":"" },
				 { "mData": "chuyennganh", "defaultContent":"" },
				 { "mData": "truong", "defaultContent":"" },
				 { "mData": "xeploai", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "trinhdochuyenmon/" + $('#thuyenvienId').val()   ;
	
	
    
	
	var table = $('#xtable_trinhdochuyenmon').DataTable({
				//dom: "Blfrtip",
				//buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "scrollY": "150px",
			    "paging":         false,
			    "autoWidth": true,
			    "ordering": false,
                "scrollX":  true,
                "searching": false,
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": columnDefs_01,
				"aoColumns": aoColumns_01
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editTrinhDoChuyenMon/';
		initEventClickForEditOrDelete("xtable_trinhdochuyenmon",".trinhdochuyenmon-edit",url);
		
		
		url = page_context + 'deleteTrinhDoChuyenMon/';
		initEventClickForEditOrDelete("xtable_trinhdochuyenmon",".trinhdochuyenmon-delete",url);
		
	
	
		
});


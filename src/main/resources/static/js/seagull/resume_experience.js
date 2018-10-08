var columnDefs_experience = [{"title": "STT","targets": 0},
				  { 
					"targets": 1,
					"visible": false,
	                "searchable": false
				  },
				  {"title": "COMPANY","targets": 2,"width":"20%",
					   "render": function (data, type, row, meta) {
						   if(data != null)
	                	   return '<small>' + data + '<small>'
	                	   else
	                		   return ''
	                   }  
				  },
				  
				  {"title": "VESSEL NAME","targets": 3},
				  {"title": "VESSEL TYPE","targets": 4},
				  {"title": "GRT/M.EP (MT/KW)","targets": 5},
				  {"title": "RANK","targets": 6},
				  {
					  "title": "SIGN ON",
					  "targets": 7,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                		return formatDate(data);
		                }
				  },
				  {
					  "title": "SIGN OFF",
					  "targets": 8,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                		return formatDate(data);
		                }
				  },
				  {
					  "title": "",
					  "targets": 9,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdochuyenmon-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 10,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs trinhdochuyenmon-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_experience = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
				 { "mData": "tencongty", "defaultContent":"" },
			     { "mData": "tentau", "defaultContent":"" },
			  	 { "mData": "loaitau_text", "defaultContent":"" },
				 { "mData": "trongtai", "defaultContent":"" },
				 { "mData": "chucdanh_text", "defaultContent":"" },
				 { "mData": "tungay", "defaultContent":"" },
				 { "mData": "denngay", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	
	var url = $('#PageContext').val() + "experience/" + $('#thuyenvienId').val()   ;
	var url1 = $('#PageContext').val() + "experience1/" + $('#thuyenvienId').val()   ;
	
	
    
	
	var table = $('#xtable_experience').DataTable({
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
                "columnDefs": columnDefs_experience,
				"aoColumns": aoColumns_experience
		 });
		table.columns.adjust().draw();
		
		
		var table1 = $('#xtable_experience1').DataTable({
			//dom: "Blfrtip",
			//buttons: btnjs,
			"sAjaxSource": url1,
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
            "columnDefs": columnDefs_experience,
			"aoColumns": aoColumns_experience
	 });
	table1.columns.adjust().draw();
		
		
		var url = page_context + 'editTrinhDoChuyenMon/';
		initEventClickForEditOrDelete("xtable_trinhdochuyenmon",".trinhdochuyenmon-edit",url);
		
		
		url = page_context + 'deleteTrinhDoChuyenMon/';
		initEventClickForEditOrDelete("xtable_trinhdochuyenmon",".trinhdochuyenmon-delete",url);
		
	
	
		
});


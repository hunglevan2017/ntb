


var columnDefs_rank = [
						{"title": "STT","targets": 0},
				  		{ "targets": 1,"visible": false,"searchable": false},
					    {"title": "Chức Danh","targets": 2,"width":"15%"},
					    {
						  "title": "Từ Ngày",
						  "targets": 3,
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
					  "title": "Đến Ngày",
					  "targets": 4,
		                "render": function (data) {
		                	if(isNaN(data))
		                	{
		                		return '';
		                	}
		                	else
		                		return formatDate(data);
		                }
				  },
				  {"title": "Ghi Chú","targets": 5 },
				  {
					  "title": "",
					  "targets": 6,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs rank-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 7,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs rank-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];

var aoColumns_rank = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "chucdanh", "defaultContent":"" },
				 { "mData": "tungay", "defaultContent":"" },
				 { "mData": "denngay", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	
	
	
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	var page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "rank/" + $('#thuyenvienId').val()   ;
    
	var nameTable_rank = "xtable_rank";
	
	var table = $('#' + nameTable_rank).DataTable({
				//dom: "Blfrtip",
				//buttons: btnjs,
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			   // "scrollY": "150px",
			    "paging":         false,
			    "autoWidth": true,
			    "ordering": false,
                "scrollX":  true,
                "searching": false,
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(0).html(index + 1);
                },
                "columnDefs": columnDefs_rank,
				"aoColumns": aoColumns_rank
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editRank/';
		initEventClickForEditOrDelete(nameTable_rank,".rank-edit",url);
		
		
		url = page_context + 'deleteRank/';
		initEventClickForEditOrDelete(nameTable_rank,".rank-delete",url);
		
	
	
		
});


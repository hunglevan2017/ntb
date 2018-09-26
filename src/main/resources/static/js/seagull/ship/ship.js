var page_context;
var columnDefs_ship = [
						{"title": "STT","targets": 0},
				  		{ "targets": 1,"visible": false,"searchable": false},
				  		{
				  			"title": "Name",
				  			"targets": 2,
		                    "width": "15%",
		                    "render": function (data, type, row, meta) {
		                        return '<a style="text-decoration: underline;color:blue" target="_blank" href="' + page_context + 'ShipCertificate/' + row['id'] +  '">' + data + '</a>';
		                    }
				  		},
					    {"title": "Type Ship","targets": 3,"width":"15%"},
					    {"title": "Deadweight","targets": 4,"width":"15%"},
					    {"title": "Main Engine Powe","targets": 5,"width":"15%"},
					    {"title": "IMO","targets": 6,"width":"15%"},
					    {"title": "Callsign Engine Powe","targets": 7,"width":"15%"},
					    {"title": "Note","targets": 8 },
				  {
					  "title": "",
					  "targets": 9,
	                  
	                  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs ship-edit" data-id=' + row['id'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	                   }
	         
				  },
				  {
					  "title": "",
					  "targets": 10,
					  "render": function (data, type, row, meta) {
	                	   return '<button type="button" class="btn btn-primary btn-xs ship-delete" data-id=' + row['id'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	                   }
				  }
				  ];
var aoColumns_ship = [{ "mData": "stt","defaultContent":""},
				 { "mData": "id", "defaultContent":"" },
			     { "mData": "ten", "defaultContent":"" },
				 { "mData": "loaitau", "defaultContent":"" },
				 { "mData": "trongtai", "defaultContent":"" },
				 { "mData": "congsuatmay", "defaultContent":"" },
				 { "mData": "IMO", "defaultContent":"" },
				 { "mData": "callsign", "defaultContent":"" },
				 { "mData": "ghichu", "defaultContent":"" },
				 { "mData": null},
				 { "mData": null}
				 ];

$(document).ready( function () {
	
	
	
	$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
    } );
	
	
	 page_context =  $('#PageContext').val() ;
	var url = $('#PageContext').val() + "getShips"   ;
    
	var nameTable_ship = "xtable_ship";
	
	var table = $('#' + nameTable_ship).DataTable({
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
                "columnDefs": columnDefs_ship,
				"aoColumns": aoColumns_ship
		 });
		table.columns.adjust().draw();
		
		
		var url = page_context + 'editShip/';
		initEventClickForEditOrDelete(nameTable_ship,".ship-edit",url);
		
		
		url = page_context + 'deleteShip/';
		initEventClickForEditOrDelete(nameTable_ship,".ship-delete",url);
		
	
	
		
});


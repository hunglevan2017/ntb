var flagData=false;
$(document).ready(function() {
	
	function initTable(idDiv,idTable)
	{
		var html ="";
		html +=  ' <table id="' + idTable + '"';
		html +=  ' 	class="table table-striped table-bordered dataTable no-footer jambo_table bulk_action"';
		html +=  ' 	style="width: 100%">';
		html +=  ' 	<thead></thead>';
		html +=  ' </table>';
		$('#'+idDiv).append(html);
		
	}
	
	// Handler for .ready() called.
	$("#tauid").change(function() {
		console.log($("#tauid").val());
		//Reset HTML
		if(flagData)
		{
			$( "#xtable_ship_wrapper" ).remove();
			$( "#xtable_crew_wrapper" ).remove();
			initTable("tab_ship","xtable_ship");
			initTable("tab_crew","xtable_crew");
		
		}
		
		
		//Load data
		var tauid = $( "#tauid").val(); 
		if( tauid !=="0" )
		{
			loadCrewOnShip(tauid);
			loadTVDuTru(tauid);
			flagData=true;
		}
		else
		{
			
		}

	});
	
	
	
	function loadCrewOnShip(tauid){
			var columnDefs_ship = [
				{"title": "STT","targets": 0},
		  		{ "targets": 1,"visible": false,"searchable": false},
		  		{ "targets": 2,"visible": false,"searchable": false},
		  		{ "targets": 3,"visible": false,"searchable": false},
		  		{
					  "title": "TRANSFER",
					  "targets": 4,
			          "width":"10%",
			          "className": "text-center",
			          "render": function (data, type, row, meta) {
			        	  
			        	  	/*
			        	  	var color = "<button class='color bg-green'></button>";
			        	  	var f_month_leave = parseFloat( row['month_leave'] );
	                    	
	                    	if( f_month_leave >= 2 && f_month_leave <= 3 )
	                    		color =  "<button class='color bg-yellow'></button>";
	                    	
	                    	if( f_month_leave >3 )
	                    		color =  "<button class='color bg-red'></button>";
	                    	*/
	                    	
			        	   
			        	  var stop = '<button type="button" class="btn btn-primary btn-xs btnRoiTau" data-id=' + row['thuyenvienId'] + ' > </button>';
			        	 
			        	  return stop ;       
			           }
			 
				  },
		  		
		  		{
		  			"title": "NAME",
		  			"targets": 5,
	                "width": "15%",
	                "render": function (data, type, row, meta) {
	                    return '<a style="text-decoration: underline;color:blue" target="_blank" href="' + page_context + 'InfoCrew/' + row['thuyenvienId'] +  '">' + data + '</a>';
	                }
		  		},
			    {
					  "title": "D.O.B",
					  "targets": 6,
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
					  "title": "DATE ON",
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
			    {"title": "RANK","targets": 8,"width":"15%"},
			    {"title": "MONTHS TOUR","targets": 9,"width":"15%"},
			    {"title": "NOTE","targets": 10,"width":"15%"},

		  {
			  "title": "",
			  "targets": 11,
	          
	          "render": function (data, type, row, meta) {
	        	   return '<button type="button" class="btn btn-primary btn-xs ship-edit" data-id=' + row['thuyenvienId'] + ' > <i class="fa fa-edit"> </i> Edit</button>';           
	           }
	 
		  },
		  {
			  "title": "",
			  "targets": 12,
			  "render": function (data, type, row, meta) {
	        	   return '<button type="button" class="btn btn-primary btn-xs ship-delete" data-id=' + row['thuyenvienId'] + ' > <i class="fa fa-trash"> </i> Delete</button>';           
	           }
		  }
		  ];
		var aoColumns_ship = [{ "mData": "stt","defaultContent":""},
			 { "mData": "id", "defaultContent":"" },
			 { "mData": "thuyenvienId", "defaultContent":"" },
			 { "mData": "tauId", "defaultContent":"" },
			 { "mData": null},
		     { "mData": "hotenTV", "defaultContent":"" },
			 { "mData": "ngaysinhTV", "defaultContent":"" },
			 { "mData": "ngayxuongtau", "defaultContent":"" },
			 { "mData": "chucdanhht", "defaultContent":"" },
			 { "mData": "month_leave", "defaultContent":"" },
			 { "mData": "ghichuon", "defaultContent":"" },
			 { "mData": null},
			 { "mData": null}
			 ];
		$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
	        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
	    } );
		page_context =  $('#PageContext').val() ;
		var url = $('#PageContext').val() + "loadCrewOnShip/" + tauid   ;
		
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
		
		
		var url = page_context + 'RoiTau/' + tauid + "/"  ;
		initEventClickForEditOrDelete(nameTable_ship,".btnRoiTau",url);
		
		var url = page_context + 'editXuongTau/'  + tauid + "/"  ;
		initEventClickForEditOrDelete(nameTable_ship,".ship-edit",url);
		
		
		url = page_context + 'deleteShip/';
		initEventClickForEditOrDelete(nameTable_ship,".ship-delete",url);
	}
	
	function loadTVDuTru(tauid){
		//alert(2);
			var columnDefs_ship = [
				{"title": "STT","targets": 0},
		  		{ "targets": 1,"visible": false,"searchable": false},
		  		{ "targets": 2,"visible": false,"searchable": false},
		  		{ "targets": 3,"visible": false,"searchable": false},
		  		
		  		
		  		{
					  "title": "ACTION",
					  "targets": 4,
					  "width": "8%",
			          
			          "render": function (data, type, row, meta) {
			        	  
			        	  var play = '<button type="button" class="btn btn-primary btn-xs btnXuongTau" data-id=' + row['id'] + ' > </button>';
			        	  var his = '<button type="button" class="btn btn-primary btn-xs btnQuaTrinhCongTac" data-id=' + row['id'] + ' > </button>';

			        	
			        	  return play + his;
			        	              
			           }
			 
				  },
		  		
		  		{
		  			"title": "NAME",
		  			"targets": 5,
	                "width": "15%",
	                "render": function (data, type, row, meta) {
	                	
	                
	                    return '<a style="text-decoration: underline;color:blue" target="_blank" href="' + page_context + 'InfoCrew/' + row['id'] +  '">' + data + '</a>';
	                }
		  		},
			    {
					  "title": "D.O.B",
					  "targets": 6,
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
					  "title": "RESIDENCE",
					  "targets": 7
				  },
			    {"title": "RANK","targets": 8,"width":"15%"},
			    {"title": "STATUS","targets": 9,"width":"15%"},
			    {"title": "NOTE","targets": 10,"width":"15%"}
		  ];
		var aoColumns_ship = [{ "mData": "stt","defaultContent":""},
			 { "mData": "id", "defaultContent":"" },
			 { "mData": "thuyenvienId", "defaultContent":"" },
			 { "mData": "tauId", "defaultContent":"" },
			 { "mData": null},
		     { "mData": "hoten", "defaultContent":"" },
			 { "mData": "ngaysinh", "defaultContent":"" },
			 { "mData": "diachitamtru", "defaultContent":"" },
			 { "mData": "chucdanh", "defaultContent":"" },
			 { "mData": "ttddText", "defaultContent":"" },
			 { "mData": "ghichu", "defaultContent":"" }
			 ];
		$('a[data-toggle="tab"]').on( 'shown.bs.tab', function (e) {
	        $.fn.dataTable.tables( {visible: true, api: true} ).columns.adjust();
	    } );
		page_context =  $('#PageContext').val() ;
		var url = $('#PageContext').val() + "loadTVDuTru/" + tauid   ;
		
		var nameTable_ship = "xtable_crew";
		
		var table = $('#' + nameTable_ship).DataTable({
			"lengthMenu":  [[ 25, 50, -1], [ 25, 50, "All"]],
			"pageLength":25,
			//dom: "Blfrtip",
			//buttons: btnjs,
			"sAjaxSource": url,
			"sAjaxDataProp": "",
			//"order": [[ 0, "asc" ]],
		    "scrollCollapse": true,
		   // "scrollY": "150px",
		    "paging":         true,
		    "autoWidth": true,
		    "ordering": false,
		    "scrollX":  true,
		    "searching": true,
		    "fnCreatedRow": function(row,data,index) {
		        $('td',row).eq(0).html(index + 1);
		    },
		    "columnDefs": columnDefs_ship,
			"aoColumns": aoColumns_ship
		});
		table.columns.adjust().draw();
		
		
		var url = page_context + 'XuongTau/' + tauid + "/"  ;
		initEventClickForEditOrDelete(nameTable_ship,".btnXuongTau",url);
		
		
		url = page_context + 'QuaTrinhCongTac/';
		initEventClickForEditOrDelete(nameTable_ship,".btnQuaTrinhCongTac",url);
	}

	
	

});
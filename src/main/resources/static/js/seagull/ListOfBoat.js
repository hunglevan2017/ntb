$(document).ready( function () {
	
	switch ( parseInt($('#tinhtrangdieudong').val()) ) {
	    case 0:
	      	$('#title').text('ON LEAVE');
	   
	        break;
	    case 1:
	        $('#title').text('ON BOARD');
	        break;
	 
	    case -1:
	    	$('#title').text('APPLICANT');
	        break;
	    case -2:
	    	$('#title').text('TOTAL');
	        break;
	    case -3:
	    	$('#title').text('RE-SIGNED');
	        break;
	}
	
	var page_context =  $('#PageContext').val() ;
    var url = $('#PageContext').val() + "ListOfBoatFollowState/" + $('#tinhtrangdieudong').val()   ;
  
    var title = ["","No.","NAME","AGE","RANK","LAST VESSEL","DATE OFF","MONTH","NOTE","NOTE DIRECTOR","REPATRIATION","ID","HISTORY"];
	var table = $('#tb_ListOfCrew').DataTable({
				dom: "Blfrtip",
				  buttons: [
					{
					  extend: "copy",
					  className: "btn-sm"
					},
					{
					  extend: "csv",
					  className: "btn-sm"
					},
					{
					  extend: "excel",
					  className: "btn-sm"
					},
					{
					  extend: "pdfHtml5",
					  className: "btn-sm"
					},
					{
					  extend: "print",
					  className: "btn-sm"
					},
				  ],
				"sAjaxSource": url,
				"sAjaxDataProp": "",
				//"order": [[ 0, "asc" ]],
			    "scrollCollapse": true,
			    "paging":         false,
			    "autoWidth": false,
			    "ordering": false,
	
                "scrollX":  true,
			    fixedColumns: true,
			    
                "fnCreatedRow": function(row,data,index) {
                    $('td',row).eq(1).html(index + 1);
                },
                "columnDefs": [ 
                {
                    "targets": 0,
                    
                    "data": null,
                    "defaultContent": "<div class='color bg-green'></div>",
                    "render": function (data, type, row, meta) {
                    	
                    	var f_month_leave = parseFloat( row['month_leave'] );
                    	
                    	if( f_month_leave >= 2 && f_month_leave <= 3 )
                    		return  "<div class='color bg-yellow'></div>";
                    	
                    	if( f_month_leave >3 )
                        	return  "<div class='color bg-red'></div>";
                    }
                } ,
                {
                    "targets": 1,
                    "width": "2%"
                   
                } ,
                {
                    "targets": 2,
                    "width": "15%",
                    "render": function (data, type, row, meta) {
                        return '<a target="_blank" href="' + page_context + 'InfoCrew/' + row['id'] +  '">' + data + '</a>';
                    }
                
                   
                } ,
                {
                    "targets": 3,
                    "width": "2%"
                    
                   
                } ,
                {
                    "targets": 4,
                    "width": "10%"
                   
                } ,
                {
                    "targets": 5,
                    "width": "15%"
                   
                } ,
          
                {
                	"targets": 6,
                	"data": "ngayOffHoacOnGanNhat",
	                "render": function (data) {
	                	if(isNaN(data))
	                	{
	                		return '';
	                	}
	                	else
	                	{
	                		var date = new Date(data);
	                		var month = date.getMonth() + 1;
	                		return date.getDate() +  "/" + (month.length > 1 ? month : "0" + month) + "/" + date.getFullYear();
	                	}
	                }
                }      ,
                {
                    "targets": 9,
                    "width": "5%"
                } ,
                {
                    "targets": 11,
                    "visible": false,
                    "searchable": false
                    } ,
                {
                    "targets": 12,
                    "data": null,
                    "defaultContent": "   <button type='button' class='btn btn-primary btn-xs'> <i class='fa fa-user'> </i> View</button>"
                }

                
                ],
				"aoColumns": [
					 { "mData": null},
				     { "mData": null},
				     { "mData": "hoten", "defaultContent":"" },
			      	 { "mData": "age", "defaultContent":"" },
					 { "mData": "chucdanh", "defaultContent":"" },
					 { "mData": "tauOffHoacOnGanNhat", "defaultContent":"" },
					 { "mData": "ngayOffHoacOnGanNhat", "defaultContent":"" },
					 { "mData": "month_leave", "defaultContent":"" },
					 { "mData": "ghichu", "defaultContent":"" },
					 { "mData": null, "defaultContent":"" },
					 { "mData": "diemhoihuong", "defaultContent":"" },
					 { "mData": "id", "defaultContent":"" }
				]
		 });
		 
		 
		  $('#tb_ListOfCrew tbody').on( 'click', 'button', function () {
		        var data = table.row( $(this).parents('tr') ).data();
		        console.log(data);
		        alert( data[3] +"'s salary is: "+ data[ 5 ] );
		    } );
		  
		  for (var i=0;i<title.length;i++) {
              table.columns(i).header().to$().text(title[i])
          }
          table.columns.adjust().draw();
		 
});


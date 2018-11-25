
$(document).ready( function () {
	
	$('#title').text('Search Crews');
	

	
	
	var page_context =  $('#PageContext').val() ;
    var url = $('#PageContext').val() + "searchRest?crew=" + $('#tinhtrangdieudong').val()   ;
    

  
    var title = ["","No.","NAME","AGE","RANK","VESSEL","DATE","MONTHS","NOTES","REPATRIATION","ID","HISTORY"];
	var table = $('#tb_ListOfCrew').DataTable({
		
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
                    "width": "20%",
                    "render": function (data, type, row, meta) {
                        return '<a href="' + page_context + 'InfoCrew/' + row['id'] +  '"><strong>' + data + '</strong></a>';
                    }
                
                   
                } ,
                {
                    "targets": 3,
                    "width": "2%"
                    
                   
                } ,
                {
                    "targets": 4,
                    "width": "5%"
                   
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
	                		console.log("month:" + month.length);
	                		return date.getDate() +  "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
	                	}
	                }
                }      ,
                {
                    "targets": 8,
                    "width": "15%"
                } ,
                {
                    "targets": 10,
                    "width": "5%",
                    "visible": false,
                    "searchable": false
                    } ,
                {
                    "targets": 11,
                    "data": null,
                    "render": function (data, type, row, meta) {
			        	  

			        	  var his = '<button type="button" class="btn btn-primary btn-xs btnQuaTrinhCongTac" data-id=' + row['id'] + ' > </button>';
			        	  return  his;
			        	              
			           }
                
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
				
					 { "mData": "diemhoihuong", "defaultContent":"" },
					 { "mData": "id", "defaultContent":"" }
				]
		 });
		 
	
		  for (var i=0;i<title.length;i++) {
              table.columns(i).header().to$().text(title[i])
          }
          table.columns.adjust().draw();
          
          url = page_context + 'history/';
  		initEventClickForEditOrDelete("tb_ListOfCrew",".btnQuaTrinhCongTac",url);
  		
		 
});
$('#cusloading').hide();


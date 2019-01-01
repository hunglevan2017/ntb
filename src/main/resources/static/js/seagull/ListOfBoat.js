

function getRowContractSelect(table)
{
		var arrayPost = [];
		var data = table.rows().nodes();
		$.each(data, function(index, value) {
			if ( $(this).find('input').prop('checked') )
			{
				console.log(table.row(index).data() );
				table.row(index).data().ss = 1;
				arrayPost.push( table.row(index).data() );
			}
			else
			{
				table.row(index).data().ss = 0;
				arrayPost.push( table.row(index).data() );
			}
		});
		
		$.ajax({
            type: "POST",
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(arrayPost),
            dataType: 'json',
            url: $('#PageContext').val()  + "user/updateSS",
            success: function(msg) {
				console.log(msg);
                if(msg=="1")
                {
                	alert("Cập nhật thành công");
                }
                else
                {
                	
                }
               
            },
            error: function(xhr, ajaxOptions,
                thrownError) {
                console.log(xhr.status);
                console.log(thrownError);
            }
        });
		
		return arrayPost;

}


$(document).ready( function () {
	
	

	var nameShip="LAST VESSEL";
	var dateOn="DATE OFF";
	switch ( parseInt($('#tinhtrangdieudong').val()) ) {
	    case 0:
	      	$('#title').text('ON LEAVE');
	   
	        break;
	    case 1:
	        $('#title').text('ON BOARD');
	       	nameShip = "VESSEL";
	      	dateOn="DATE ON";
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
    
    var report=[];
    var table;
    if($('#tinhtrangdieudong').val()==="0"  )
    {
    	report =  [
            {
                text: '<i class="fa fa-download"></i> EXCEL',
                className:'btn btn-success source',
                action: function ( e, dt, node, config ) {
                	window.location = page_context + "report/DuTru";
                }
            },
            {
                text: '<i class="fa fa-edit"></i> Save SS',
                className:'btn btn-success source',
                action: function ( e, dt, node, config ) {
                	var List = getRowContractSelect(table);
                	console.log(List);
                	
                }
            }
        ];
    }
    
    if($('#tinhtrangdieudong').val()==="1"  )
    {
    	report =  [
            {
                text: '<i class="fa fa-download"></i> EXCEL',
                className:'btn btn-success source',
                action: function ( e, dt, node, config ) {
                	window.location = page_context + "report/onboard";
                }
            }
        ];
    }
    
  
    var title = ["#","NAME","AGE","RANK",nameShip,dateOn,"MONTHS","NOTES","REPATRIATION","SS","ID",""];
    table = $('#tb_ListOfCrew').DataTable({
				dom: "Blfrtip",
				 buttons:report,
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
                    $('td',row).eq(0).html(index + 1);
                },
                
                "fnRowCallback": function( nRow, aData, iDisplayIndex, iDisplayIndexFull ) {
               
                    
                    var f_month_leave = parseFloat( aData.month_leave );
            
                  
                   // $('td', nRow).css('font-weight','bold');
                	if( f_month_leave >= 4 && f_month_leave < 6 )
                		  $('td', nRow).css('background-color', 'rgb(250, 250, 139)');
                	
                	if( f_month_leave >= 6 )
                	{
                		 $('td', nRow).css('color','black');
                		  $('td', nRow).css('background-color', 'rgb(255, 168, 168)');
                	}
                },
                
                "columnDefs": [ 

                {
                    "targets": 0,
                    "width": "2%"
                   
                } ,
                {
                    "targets": 1,
                    "width": "20%",
                    "render": function (data, type, row, meta) {
                        return '<a href="' + page_context + 'InfoCrew/' + row['id'] +  '"><span style="color:black">' + data + '</span></a>';
                    }
                
                   
                } ,
                {
                    "targets": 2,
                    "width": "2%"
                    
                   
                } ,
                {
                    "targets": 3,
                    "width": "5%"
                   
                } ,
                {
                    "targets": 4,
                    "width": "5%"
                   
                } ,
          
                {
                	"targets": 5,
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
	             
	                		return date.getDate() +  "/" + (month > 9 ? month : "0" + month) + "/" + date.getFullYear();
	                	}
	                }
                }      ,
                {
                    "targets": 7,
                    "width": "25%"
                } ,
                {
                    "targets": 9,
                    "render": function (data, type, row, meta) {
			        	  
                    	console.log("ss:"+data)
                    	 var his;
                    	if(data==1)
                    		 his =  '<input style="width: 20px;height: 15px;" type="checkbox"  value="Bike" id="ss'+ row['id'] + '" checked>';
			        	  else
			        		 his =  '<input style="width: 20px;height: 15px;" type="checkbox" value="Bike" id="ss'+ row['id'] + '">';
			        	  return  his;
			        	              
			           }
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
			        	  
                    	
                    		var   his = '<button type="button" class="btn btn-primary btn-xs btnQuaTrinhCongTac" data-id=' + row['id'] + ' > </button>';
                    
                    
			        	  
			        	  return  his;
			        	              
			           }
                
                }

                
                ],
				"aoColumns": [
					
				     { "mData": null},
				     { "mData": "hoten", "defaultContent":"" },
			      	 { "mData": "age", "defaultContent":"" },
					 { "mData": "chucdanh", "defaultContent":"" },
					 { "mData": "ali", "defaultContent":"" },
					 { "mData": "ngayOffHoacOnGanNhat", "defaultContent":"" },
					 { "mData": "month_leave", "defaultContent":"" },
					 { "mData": "ghichu", "defaultContent":"" },
				
					 { "mData": "diemhoihuong", "defaultContent":"" },
					 { "mData": "ss", "defaultContent":"" },
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


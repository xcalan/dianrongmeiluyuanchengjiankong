Highcharts.setOptions({
	global: {
		useUTC: false
	}
});

Highcharts.chart('u129', {
	chart: {
		plotBackgroundColor: null,
		plotBorderWidth: null,
		plotShadow: false,
		type: 'pie',
		events: {
			load: function () {
				var series = this.series[0];
				//chart = this;
				// activeLastPointToolip(chart);
				setInterval(function () {
					// jQuery.getJSON('http://localhost:8080/show_system2/servlet/FurRecentServlet',null,function(data) {//实时更新
					var newData = [
						{
							name: '优化状态百分比',
							y: 50 + 10*Math.random(),
							//sliced: true,
							selected: true
						}, {
							name: '非优状态百分比',
							y: 30 + 10*Math.random()
						}, {
							name: '超允许区间百分比',
							y: 20 + 10*Math.random()
						}
					]
					for(let each of newData){
						series.removePoint(0); // 删除旧数据
						series.addPoint(each); // 添新数据
					}
					// activeLastPointToolip(chart);
					// });//实时更新
				}, 1000);
			}
		}
	},
	title: {
		text: ''
	},
	colors:['#4dd3b9','#fdd67f','#ffaca8'],
	tooltip: {
		pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
	},
	plotOptions: {
		pie: {
			allowPointSelect: true,
			cursor: 'pointer',
			dataLabels: {
				enabled: true,
				format: '<b>{point.name}</b>: {point.percentage:.1f} %',
				style: {
					color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
				}
			}
		}
	},
	credits:{
		enabled:false
	},
	series: [{
		name: 'Brands',
		colorByPoint: true,
		data: [{
			name: '优化状态百分比',
			y: 85,
			sliced: true,
			selected: true
		}, {
			name: '非优状态百分比',
			y: 5
		}, {
			name: '超允许区间百分比',
			y: 15
		}]
	}]
});

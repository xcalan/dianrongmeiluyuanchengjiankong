Highcharts.setOptions({
	global: {
		useUTC: false
	}
});
function activeLastPointToolip(chart) {
	var points = chart.series[0].points;
	chart.tooltip.refresh(points[points.length -1]);
}
var chart = Highcharts.chart('u295_img', {
	chart: {
        type: 'spline',
		marginRight: 10,
		events: {
			load: function () {
				var series = this.series[0],
					chart = this;
				activeLastPointToolip(chart);
				var i=0;
				setInterval(function () {
					jQuery.getJSON('servlet/FurServlet',null,function(data) {//实时更新
					var x = (new Date()).getTime(), // 当前时间
						//y = 14000*Math.random();  // 随机值
						y = data[i].current_pi_feedforward;//PI前馈补偿值
					document.getElementById("PI_per").innerHTML = y.toFixed(1)
					i=i+1
					if(i>=1000){
						i=0;
					}					
					series.addPoint([x, y], true, true);
					activeLastPointToolip(chart);
				});//实时更新
				}, 1000);
			}
		}
	},
	title: {
		text: ''
	},
	xAxis: {
		type: 'datetime',
		tickPixelInterval: 150
	},
	yAxis: {
		title: {
			text: ''
		}
	},
	tooltip: {
        enabled:true,
		formatter: function () {
			return '<b>' + this.series.name + '</b><br/>' +
				Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
				Highcharts.numberFormat(this.y, 2);
		}
	},
	legend: {
		enabled: false
    },
    exporting: {
        enabled: true
    },
    credits: {
        enabled: false
    },
	series: [{
        name: 'PI前馈补偿值',      
        color:'#388E8E',
        lineWidth:2,
        marker:{
            enabled: false,
        },
		data: (function () {
			// 生成随机值
			var data = [],
				time = (new Date()).getTime(),
				i;
			for (i = -19; i <= 0; i += 1) {
				data.push({
					x: time + i * 1000,
					y: 0
				});
			}
			return data;
		}())
	}]
});
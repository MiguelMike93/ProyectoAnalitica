function barras(id, urlDatos) {
    var div = d3.select("#" + id);
    div.class = 'barras';

    var w = document.getElementById(id).clientWidth;
    div.html('<svg width="' + w + '" height="' + (window.innerWidth * 4 / 12 * 9 / 16+20) + '"></svg>');

    var svg = d3.select("#" + id + ">svg");
    var margin = {top: 70, right: 60, bottom: 0, left: 60};
    var width = +w - margin.left - margin.right;
    var height = +(window.innerWidth * 4 / 12 * 9 / 16) - margin.top - margin.bottom;

    var x = d3.scaleBand().rangeRound([0, width]).padding(0.1);
    var y = d3.scaleLinear().rangeRound([height, 0]);

    var g = svg.append("g")
            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

        //tooltip
        var tooltip = svg.append('g')
                .classed('labels-group', true)
                .attr('id', 'tooltip-' + id)
                .attr("class", "tooltip1");

        tooltip.append('rect')
                .attr("width", "150")
                .attr("height", "50")
                .attr("rx", "5")
                .attr("ry", "5")
                .attr("x", -25)
                .attr("y", 10);
        
        tooltip.append('polygon')
                .attr("style", "fill:steelblue;stroke:steelblue;stroke-width:1")
                .attr("points", function (d) {
                    var p1 = '40,60';
                    var p2 = '60,60';
                    var p3 = '50,70';
                    return '' + p1 + ' ' + p2 + ' ' + p3;
                });
        
        tooltip.append('text')
                .attr("class", "tooltip-title")
                .attr("text-anchor", "middle")
                .attr("x", 50)
                .attr("y", 25)
                .text("b");
        tooltip.append('text')
                .attr("class", "tooltip-info")
                .attr("text-anchor", "middle")
                .attr("x", 50)
                .attr("y", 40)
                .text("a");
        tooltip.append('text')
                .attr("class", "tooltip-porcentaje")
                .attr("text-anchor", "middle")
                .attr("x", 50)
                .attr("y", 55)
                .text("c");

    d3.json(urlDatos, function (error, data) {
        if (error)
            throw error;
        
        var total=d3.sum(data.map(function (v) {
            return v.valor;
        }));
            
        x.domain(data.map(function (d) {
            return d.id;
        }));
        y.domain([0, d3.max(data, function (d) {
                return d.valor;
            })]);

        g.append("g")
                .attr("class", "axis axis--x")
                .attr("transform", "translate(0," + height + ")")
                .call(d3.axisBottom(x));

        g.append("g")
                .attr("class", "axis axis--y")
                .call(d3.axisLeft(y))
                .append("text")
                .attr("transform", "rotate(-90)")
                .attr("y", 6)
                .attr("dy", "0.71em")
                .attr("text-anchor", "end")
                .text("Frequency");

        g.selectAll(".bar")
                .data(data)
                .enter().append("rect")
                .attr("class", "bar")
                .attr("x", function (d) {
                    return x(d.id);
                })
                .attr("y", function (d) {
                    return y(d.valor);
                })
                .attr("width", x.bandwidth())
                .attr("height", function (d) {
                    return height - y(d.valor);
                })
                .on('mouseover', function (d) {
                    d3.select('#tooltip-' + id).attr('class', 'tooltip2');
                    d3.select('#tooltip-' + id+' .tooltip-title').html(d.clave);
                    d3.select('#tooltip-' + id+' .tooltip-info').html(d.valor);
                    d3.select('#tooltip-' + id+' .tooltip-porcentaje').html(d3.format(".2%")(d.valor/total));
                    
                    var x1 = x(d.id)+x.bandwidth()/2+10;
                    var y1 = y(d.valor)-5;
                    d3.select('#tooltip-' + id).attr("transform", "translate(" +x1+ ", "+y1+")");
                })
                .on('mouseout', function (d) {
                    $('#tooltip-' + id).attr('class', 'tooltip1');
                })
                ;
    });
}
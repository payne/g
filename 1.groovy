@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv

println("Hello, Groovy!");


personCSV="""
ID,Product,Location
HA5386,50000.00,Omaha-504
HA5387,70000.00,Omaha-504
HA5388,80000.00,Omaha-504
"""

println(personCSV);


def data = parseCsv(personCSV)
for(line in data) {
    println "ID=$line.ID, Product=$line.Product"
}



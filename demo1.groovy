@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv
def csv = '''ID,Product
3,Shoe
1,Table'''

def data = parseCsv(csv)
for(line in data) {
    println "ID=$line.ID, Product=$line.Product"
}

package my

import groovy.json.JsonBuilder

class ToJson {
    static void main(String[] args) {
        jsonWithSingle()
        jsonWithMultiKey()
    }

    private static void jsonWithSingle() {
        def builder = new JsonBuilder()
        builder.people {
            person {
                firstName 'Guillame'
                lastName 'Laforge'
                address(
                        city: 'Paris',
                        country: 'France',
                        zip: 12345,
                )
                married true
                conferences 'JavaOne', 'Gr8conf'
            }
        }
        println(builder.toString())
    }

    private static void jsonWithMultiKey() {
        def builder = new JsonBuilder()
        builder {
            key1 "value1"
            key2 "value2"
        }
        println(builder.toPrettyString())
    }

}


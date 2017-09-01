package contracts.com.reachauto.hkr
import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        description(""" """)
        method 'PUT'
        url '/command/1'
        body(
                orderid:123456789,
                number:12312312
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body( """{"status": "OK"}""")
        headers {
            contentType(applicationJson())
        }
    }
}

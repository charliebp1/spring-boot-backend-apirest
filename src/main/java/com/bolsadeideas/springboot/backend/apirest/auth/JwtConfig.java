package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEArMF1bMubpdhorLAWGe+So3MI8+qvaQqqH+720IdFgkEA8VYW\r\n"
			+ "qY7T+2eKpidam6CkRvAD8n/4nW57/zuHG2FrwCPd7d7dugUlV3Xw5e8IGh20RNU4\r\n"
			+ "I9yRhenENDArVzvlk+dN3Vv5S/uvNJFM1X61h5WsLfEeNdGUXqK5Lq/+/4BdCyLl\r\n"
			+ "AQIkIqIonYGaqIIPY4L188nqZ7O62Wvcwft1dcHX75Nm0F7Npdsby5tapgalRBLA\r\n"
			+ "lS5Q8QL80ozKL+opnNn3xfuz4iiGCIVoDmGW0jvLYgru9dYVtyb7cX+nLPdDrv6p\r\n"
			+ "pdHrt1+HzLnE28o9ZO6bmRIhd7Dlf5gICx4EKwIDAQABAoIBACEv8Qz7eGU9064J\r\n"
			+ "DdXhrjv0J24kUZpOUCxeTc/1jKbfMf0q2qOsKpELbRlKSh/HloeCKF/3sZ0c0nlP\r\n"
			+ "yD68UmTQ/xtpSxMnVesdXy/s4ZOSzUTD6UsKXnJpXCXicxEJEqt9LfouZw/vw9LH\r\n"
			+ "bwk8lEb9u9v/jBwurOAZRpXvfX87qqWqKQ0sFY4ppV2I2z4ufJAPpTpoqjf76kZx\r\n"
			+ "1mk9xvKqijPz/dJL8Yyd0PiwcvlCBqM4OSz60MtHw6M41CUYHMB1Zous3pRhvQCQ\r\n"
			+ "1odpZBvNUY+vSB5XchkOfXkSC3wdO0KNAz8xu0KoyHi/PjWOvnq9lBaaoFUT+ywa\r\n"
			+ "Z8kAIBECgYEA4WOgxKrFZXZlSGoh1jmO4hMgooSussO09VhPkMSFFuL2zRgEks4M\r\n"
			+ "P6UXrpk/rmVI/UUbGIwQaNm6P7ZEYYj/jExIrGZWP25ElDFV8oFyXPnfy+0HsmcE\r\n"
			+ "3yZ6uEFttyYr9Zr1apGAkem1lgvXulPAgE0e7+uY1ddBn4+UA74ds8UCgYEAxDfc\r\n"
			+ "RVuKpfuYgjHdacPeVxvWfGKAbNxbcl+OzFq/xRYeMGiSvJ6cfaS0rDh4TzZZssnB\r\n"
			+ "2HyHzv9R3sNLJXisMYj4SLVYD16InmKi7ofFeHLIy6rWwCoiVdP3FE6zyCD4IgpF\r\n"
			+ "PBDXVwex7stXGkDZ32LM42272TxjEWTSCgGbJy8CgYA9yYATKfV/QRu25FFuVs0S\r\n"
			+ "sMerhdAWdYwwDguR1i3d/k5GHyVx0UaOVAXP+Xb5qg5+T+mDqzH8bGOgf6jzTAky\r\n"
			+ "Pt9VU6ClNudZ8MRs/IuLbXyqfMo1YAR34CaYSGd5Y999LwPEOSsT1QvQnGKBU+Bb\r\n"
			+ "y8iFYQK+7Imy4jtjY0TlOQKBgFK36dgjWzPV+NkKBHlN5TF7vtP5AoLh8nso5Z4o\r\n"
			+ "s6d2R4vIyfNSOk6NXM0tkSpzkyTYASwuc2JEKFNsqQVG9fB7+Y9NQ65W/+klU+KS\r\n"
			+ "wiCg4x1ZC+c+2/KqxQJ+mzPHElPnWICV6PH7gHtWpYWfyTlvAUjvPb26w1jV0+X7\r\n"
			+ "/1hpAoGAGkq01Dw0u97y1cZB4BNHB5Y2pu8xIbX8RcCbfNUFr4XH+R6DNVYCkkqk\r\n"
			+ "CowQVIc2k4A25Mn6O9hYHAJzig1MQjyjfaiLbnvHjkvI4Q4bnO+Oz5RfE6ZD3NQz\r\n"
			+ "supJ+D+oHqrvVodZEeCYYyyNlN9YuyB+hle20PwYzYmOoCXgsrY=\r\n"
			+ "-----END RSA PRIVATE KEY-----";	
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArMF1bMubpdhorLAWGe+S\r\n"
			+ "o3MI8+qvaQqqH+720IdFgkEA8VYWqY7T+2eKpidam6CkRvAD8n/4nW57/zuHG2Fr\r\n"
			+ "wCPd7d7dugUlV3Xw5e8IGh20RNU4I9yRhenENDArVzvlk+dN3Vv5S/uvNJFM1X61\r\n"
			+ "h5WsLfEeNdGUXqK5Lq/+/4BdCyLlAQIkIqIonYGaqIIPY4L188nqZ7O62Wvcwft1\r\n"
			+ "dcHX75Nm0F7Npdsby5tapgalRBLAlS5Q8QL80ozKL+opnNn3xfuz4iiGCIVoDmGW\r\n"
			+ "0jvLYgru9dYVtyb7cX+nLPdDrv6ppdHrt1+HzLnE28o9ZO6bmRIhd7Dlf5gICx4E\r\n"
			+ "KwIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}

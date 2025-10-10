CREATE TYPE restaurant_type AS ENUM ('ITALIAN', 'FRENCH', 'BRAZILIAN', 'MEXICAN', 'CHINESE', 'FAST_FOOD');

CREATE TABLE restaurant (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  slug VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  type restaurant_type NOT NULL,
  logo_url VARCHAR(255) NOT NULL,
  cover_url VARCHAR(255) NOT NULL
);
-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: database:3306
-- Tiempo de generación: 22-02-2024 a las 18:04:43
-- Versión del servidor: 8.1.0
-- Versión de PHP: 8.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `molerobasic`
--

CREATE DATABASE molerobasic;
USE molerobasic;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calendario`
--

CREATE TABLE `calendario` (
  `id` int NOT NULL,
  `title` varchar(255) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `calendario`
--

INSERT INTO `calendario` (`id`, `title`, `date`) VALUES
(1, 'Revisión Pau', '2024-02-14'),
(2, 'Evento 2', '2024-02-15'),
(3, 'Evento 3', '2024-02-16'),
(4, 'Evento 4', '2024-02-17'),
(5, 'Evento 5', '2024-02-18'),
(6, 'Evento 6', '2024-02-19'),
(7, 'Evento 7', '2024-02-20'),
(8, 'Evento 8', '2024-02-21'),
(9, 'Evento 9', '2024-02-22'),
(10, 'Evento 10', '2024-02-23'),
(11, 'Evento 11', '2024-02-24'),
(12, 'Evento 12', '2024-02-25'),
(13, 'Evento 13', '2024-02-26'),
(14, 'Evento 14', '2024-02-27'),
(15, 'Evento 15', '2024-02-28'),
(16, 'Evento 16', '2024-02-29'),
(17, 'Evento 17', '2024-03-01'),
(18, 'Evento 18', '2024-03-02'),
(19, 'Evento 19', '2024-03-03'),
(20, 'Evento 20', '2024-03-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diagnostico`
--

CREATE TABLE `diagnostico` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `descripcion` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `diagnostico`
--

INSERT INTO `diagnostico` (`id`, `nombre`, `descripcion`) VALUES
(1, 'Dolor de cabeza', 'El dolor de cabeza, también conocido como cefalea, puede tener diversas causas. Algunas de las razones más comunes incluyen:\r\n1. Tensión muscular: La tensión en los músculos del cuello y la cabeza puede causar dolores de cabeza tensionales.\r\n2. Migrañas: Las migrañas son dolores de cabeza intensos y pulsátiles que a menudo están acompañados de otros síntomas, como náuseas, sensibilidad a la luz y al sonido.\r\n3. Problemas de visión: La fatiga visual, la presión ocular y otros problemas visuales pueden desencadenar dolores de cabeza.\r\n4. Estrés: El estrés emocional o físico puede desencadenar dolores de cabeza.Desencadenantes alimentarios: Algunas personas experimentan dolores de cabeza debido a ciertos alimentos o aditivos alimentarios.\r\n5. Cambios hormonales: Especialmente en mujeres, las fluctuaciones hormonales, como las que ocurren durante el ciclo menstrual, el embarazo o la menopausia, pueden desencadenar dolores de cabeza.\r\n6. Consumo de cafeína: Tanto la falta de cafeína en personas acostumbradas como el exceso de consumo pueden causar dolores de cabeza.\r\n7. Cambios en el clima: Algunas personas son sensibles a los cambios de clima y pueden experimentar dolores de cabeza debido a estas variaciones.\r\n8. Sinusitis: La inflamación de los senos paranasales puede causar dolor facial y de cabeza.\r\nProblemas de sueño: La falta de sueño o patrones de sueño irregulares pueden contribuir a dolores de cabeza.'),
(3, 'Dolor de pies', '1. Calzado inadecuado: Zapatos que no se ajustan correctamente o no proporcionan suficiente soporte. 2. Lesiones: Torceduras, esguinces o fracturas pueden causar dolor en los pies. 3. Pie plano: La falta de arco en el pie puede contribuir al dolor. 4. Fascitis plantar: Inflamación en la parte inferior del pie, comúnmente causada por el estrés en el tejido. 5. Neuroma de Morton: Engrosamiento del tejido alrededor de los nervios entre los dedos del pie. 6. Artritis: Inflamación de las articulaciones, también puede afectar los pies. 7. Problemas circulatorios: Mala circulación sanguínea puede causar dolor en los pies. 8. Sobrepeso: El exceso de peso puede ejercer presión adicional sobre los pies.'),
(4, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(5, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(6, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(7, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(8, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(9, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(10, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(11, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(12, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(13, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(14, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(15, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(16, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(17, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo'),
(18, 'Dolor de cabeza', 'Dolor fuerte de cabeza continuado y prolongado en el tiempo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicacion`
--

CREATE TABLE `medicacion` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `descripcion` text,
  `medida_id` int DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `medicacion`
--

INSERT INTO `medicacion` (`id`, `nombre`, `descripcion`, `medida_id`) VALUES
(63, 'Paracetamol', 'El paracetamol es un medicamento utilizado principalmente para aliviar el dolor y reducir la fiebre. También se conoce como acetaminofén en algunos lugares.', 1),
(64, 'Ibuprofeno', 'Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor.', 1),
(65, 'Amoxicilina', 'Antibiótico utilizado para tratar diversas infecciones.', 6),
(66, 'Omeprazol', 'Inhibidor de la bomba de protones utilizado para tratar problemas estomacales.', 5),
(67, 'Aspirina', 'Antiinflamatorio, analgésico y antiagregante plaquetario.', 1),
(68, 'Atorvastatina', 'Estatina utilizada para reducir los niveles de colesterol.', 10),
(69, 'Insulina', 'Hormona utilizada para tratar la diabetes.', 6),
(70, 'Diazepam', 'Ansiolítico utilizado para tratar la ansiedad y otros trastornos.', 1),
(71, 'Morfina', 'Analgésico opiáceo utilizado para tratar el dolor severo.', 1),
(72, 'Warfarina', 'Anticoagulante utilizado para prevenir la formación de coágulos sanguíneos.', 5),
(73, 'Metformina', 'Antidiabético oral utilizado para tratar la diabetes tipo 2.', 6),
(74, 'Clonazepam', 'Medicamento antiepiléptico y ansiolítico.', 1),
(75, 'Levotiroxina', 'Hormona tiroidea utilizada para tratar la hipotiroidismo.', 10),
(76, 'Hidroclorotiazida', 'Diurético utilizado para tratar la hipertensión arterial.', 5),
(77, 'Venlafaxina', 'Antidepresivo utilizado para tratar la depresión y trastornos de ansiedad.', 1),
(78, 'Paracetamol', 'Medicamento para aliviar el dolor y reducir la fiebre.', 1),
(79, 'Ibuprofeno', 'Antiinflamatorio no esteroideo (AINE) utilizado para aliviar el dolor.', 1),
(80, 'Amoxicilina', 'Antibiótico utilizado para tratar diversas infecciones.', 6),
(81, 'Omeprazol', 'Inhibidor de la bomba de protones utilizado para tratar problemas estomacales.', 5),
(82, 'Aspirina', 'Antiinflamatorio, analgésico y antiagregante plaquetario.', 1),
(83, 'Atorvastatina', 'Estatina utilizada para reducir los niveles de colesterol.', 10),
(84, 'Insulina', 'Hormona utilizada para tratar la diabetes.', 6),
(85, 'Diazepam', 'Ansiolítico utilizado para tratar la ansiedad y otros trastornos.', 1),
(86, 'Morfina', 'Analgésico opiáceo utilizado para tratar el dolor severo.', 1),
(87, 'Warfarina', 'Anticoagulante utilizado para prevenir la formación de coágulos sanguíneos.', 5),
(88, 'Metformina', 'Antidiabético oral utilizado para tratar la diabetes tipo 2.', 6),
(89, 'Clonazepam', 'Medicamento antiepiléptico y ansiolítico.', 1),
(90, 'Levotiroxina', 'Hormona tiroidea utilizada para tratar la hipotiroidismo.', 10),
(91, 'Hidroclorotiazida', 'Diurético utilizado para tratar la hipertensión arterial.', 5),
(92, 'Venlafaxina', 'Antidepresivo utilizado para tratar la depresión y trastornos de ansiedad.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medida`
--

CREATE TABLE `medida` (
  `id` int NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `medida`
--

INSERT INTO `medida` (`id`, `nombre`) VALUES
(1, 'Miligramos'),
(5, 'Kilogramo'),
(6, 'Litro'),
(7, 'Metro'),
(8, 'Unidad'),
(9, 'Gramo'),
(10, 'Mililitro'),
(11, 'Centímetro'),
(12, 'Pieza'),
(13, 'Miligramo'),
(14, 'Microgramo'),
(15, 'Onza'),
(16, 'Libra'),
(17, 'Galon'),
(18, 'Metro cúbico'),
(19, 'Pulgada'),
(20, 'Kilogramo'),
(21, 'Litro'),
(22, 'Metro'),
(23, 'Unidad'),
(24, 'Gramo'),
(25, 'Mililitro'),
(26, 'Centímetro'),
(27, 'Pieza'),
(28, 'Miligramo'),
(29, 'Microgramo'),
(30, 'Onza'),
(31, 'Libra'),
(32, 'Galon'),
(33, 'Metro cúbico'),
(34, 'Pulgada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id` int NOT NULL,
  `codigo` varchar(20) NOT NULL,
  `fnacimiento` date DEFAULT '2002-02-02',
  `nombre` varchar(30) NOT NULL,
  `papellido` varchar(30) NOT NULL,
  `sapellido` varchar(30) DEFAULT NULL,
  `foto` varchar(200) DEFAULT NULL,
  `seguromedico_id` int DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `codigo`, `fnacimiento`, `nombre`, `papellido`, `sapellido`, `foto`, `seguromedico_id`) VALUES
(5, 'PAC001', '1990-05-15', 'Juan', 'Pérez', 'Gómez', 'url_foto_juan.jpg', 3),
(6, 'PAC002', '1985-08-22', 'Ana', 'López', 'Martínez', 'url_foto_ana.jpg', 6),
(7, 'PAC003', '2000-02-10', 'Carlos', 'Rodríguez', 'Hernández', 'url_foto_carlos.jpg', 9),
(8, 'PAC004', '1978-11-05', 'Laura', 'García', 'Fernández', 'url_foto_laura.jpg', 2),
(9, 'PAC005', '1995-03-28', 'Miguel', 'Martínez', 'Díaz', 'url_foto_miguel.jpg', 7),
(10, 'PAC006', '1982-09-18', 'Isabel', 'Sánchez', 'Ramírez', 'url_foto_isabel.jpg', 10),
(11, 'PAC007', '1998-07-12', 'Antonio', 'Gómez', 'Pérez', 'url_foto_antonio.jpg', 13),
(12, 'PAC008', '1989-12-03', 'María', 'Fernández', 'López', 'url_foto_maria.jpg', 15),
(13, 'PAC009', '1975-04-20', 'Javier', 'Hernández', 'García', 'url_foto_javier.jpg', 4),
(14, 'PAC010', '1993-06-07', 'Silvia', 'Ramírez', 'González', 'url_foto_silvia.jpg', 12),
(15, 'PAC001', '1990-05-15', 'Juan', 'Pérez', 'Gómez', 'url_foto_juan.jpg', 3),
(16, 'PAC002', '1985-08-22', 'Ana', 'López', 'Martínez', 'url_foto_ana.jpg', 6),
(17, 'PAC003', '2000-02-10', 'Carlos', 'Rodríguez', 'Hernández', 'url_foto_carlos.jpg', 9),
(18, 'PAC004', '1978-11-05', 'Laura', 'García', 'Fernández', 'url_foto_laura.jpg', 2),
(19, 'PAC005', '1995-03-28', 'Miguel', 'Martínez', 'Díaz', 'url_foto_miguel.jpg', 7),
(20, 'PAC006', '1982-09-18', 'Isabel', 'Sánchez', 'Ramírez', 'url_foto_isabel.jpg', 10),
(21, 'PAC007', '1998-07-12', 'Antonio', 'Gómez', 'Pérez', 'url_foto_antonio.jpg', 13),
(22, 'PAC008', '1989-12-03', 'María', 'Fernández', 'López', 'url_foto_maria.jpg', 15),
(23, 'PAC009', '1975-04-20', 'Javier', 'Hernández', 'García', 'url_foto_javier.jpg', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `progenitor`
--

CREATE TABLE `progenitor` (
  `id` int NOT NULL,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `papellido` varchar(30) NOT NULL,
  `sapellido` varchar(30) DEFAULT NULL,
  `rol` varchar(5) NOT NULL DEFAULT 'Padre',
  `paciente_id` int DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `progenitor`
--

INSERT INTO `progenitor` (`id`, `dni`, `nombre`, `papellido`, `sapellido`, `rol`, `paciente_id`) VALUES
(3, '123456789', 'María', 'Gómez', 'Pérez', '0', 5),
(4, '987654321', 'Carlos', 'López', 'Martínez', '1', 5),
(5, '567890123', 'Isabel', 'Rodríguez', 'Hernández', '0', 12),
(6, '345678901', 'Antonio', 'García', 'Fernández', '1', 12),
(7, '678901234', 'Elena', 'Martínez', 'Díaz', '0', 20),
(8, '890123456', 'Javier', 'Sánchez', 'Ramírez', '1', 20),
(9, '012345678', 'Luisa', 'Gómez', 'Pérez', '0', 8),
(10, '543210987', 'Pedro', 'Fernández', 'López', '1', 7),
(11, '123456789', 'María', 'Gómez', 'Pérez', '0', 16),
(12, '987654321', 'Carlos', 'López', 'Martínez', '1', 16),
(13, '567890123', 'Isabel', 'Rodríguez', 'Hernández', '0', 15),
(14, '345678901', 'Antonio', 'García', 'Fernández', '1', 15),
(15, '678901234', 'Elena', 'Martínez', 'Díaz', '0', 6),
(16, '890123456', 'Javier', 'Sánchez', 'Ramírez', '1', 6),
(17, '012345678', 'Luisa', 'Gómez', 'Pérez', '0', 7),
(18, '543210987', 'Pedro', 'Fernández', 'López', '1', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

CREATE TABLE `prueba` (
  `id` int NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `descripcion` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`id`, `nombre`, `descripcion`) VALUES
(1, 'Radiografía', 'Examen de diagnóstico por imágenes que utiliza rayos X para visualizar estructuras internas del cuerpo.'),
(2, 'Análisis de sangre', 'Prueba de laboratorio que evalúa la composición de la sangre, incluyendo glóbulos rojos, blancos y niveles de glucosa.'),
(3, 'Ecografía abdominal', 'Técnica de imagen que utiliza ultrasonido para visualizar órganos internos del abdomen.'),
(4, 'Tomografía computarizada (TC)', 'Exploración médica que utiliza rayos X y tecnología computarizada para obtener imágenes detalladas del interior del cuerpo.'),
(5, 'Resonancia magnética (RM)', 'Técnica de imagen que utiliza campos magnéticos y ondas de radio para obtener imágenes detalladas de estructuras internas.'),
(6, 'Electrocardiograma (ECG)', 'Registro gráfico de la actividad eléctrica del corazón durante un período de tiempo.'),
(7, 'Colonoscopia', 'Procedimiento endoscópico que permite visualizar el interior del colon para detectar anomalías y realizar biopsias.'),
(8, 'Endoscopia gástrica', 'Examen visual del interior del estómago utilizando un endoscopio flexible.'),
(9, 'Prueba de esfuerzo', 'Evaluación de la respuesta cardiovascular durante el ejercicio físico.'),
(10, 'Biopsia de tejido', 'Procedimiento para obtener una muestra de tejido para su análisis microscópico.'),
(11, 'Prueba de alergia', 'Evaluación de la respuesta del sistema inmunológico a sustancias específicas.'),
(12, 'Hemograma completo', 'Análisis de sangre que proporciona información sobre células sanguíneas y su concentración.'),
(13, 'Cistoscopia', 'Examen visual del interior de la vejiga utilizando un cistoscopio.'),
(14, 'Mamografía', 'Radiografía de las mamas para la detección precoz de posibles anomalías o tumores.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguromedico`
--

CREATE TABLE `seguromedico` (
  `id` int NOT NULL,
  `companyia` varchar(20) NOT NULL,
  `descripcion` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `seguromedico`
--

INSERT INTO `seguromedico` (`id`, `companyia`, `descripcion`) VALUES
(1, 'Mapfre', 'Tu seguro de salud con las mejores coberturas.\r\nGracias al sello profesional de MAPFRE, podrás contar con las coberturas que hacen de la nuestra una póliza única, como nuestra atención telefónica personalizada las 24 horas del día.'),
(2, 'SeguroSalud', 'Seguro médico que ofrece cobertura integral para consultas, exámenes y tratamientos.'),
(3, 'AseguraVida', 'Seguro médico con enfoque en la prevención y tratamiento de enfermedades crónicas.'),
(4, 'ProtegeSalud', 'Seguro médico con amplia red de hospitales y servicios especializados.'),
(5, 'FamiliaSegura', 'Seguro médico diseñado para cubrir a toda la familia con opciones flexibles.'),
(6, 'VidaSana', 'Seguro médico que promueve hábitos de vida saludables y acceso a servicios preventivos.'),
(7, 'CuidaBien', 'Seguro médico con cobertura para emergencias y servicios de atención primaria.'),
(8, 'SaludPlus', 'Seguro médico premium con acceso a servicios médicos de alta calidad.'),
(9, 'VitalSeguro', 'Seguro médico para cuidado integral de la salud, incluyendo medicamentos y terapias.'),
(10, 'BienestarTotal', 'Seguro médico enfocado en el bienestar físico y mental de los asegurados.'),
(11, 'CoberturaCompleta', 'Seguro médico con amplia cobertura para procedimientos quirúrgicos y hospitalización.'),
(12, 'SeguroFamiliar', 'Seguro médico diseñado para brindar protección a toda la familia.'),
(13, 'SaludProtegida', 'Seguro médico con énfasis en la protección contra enfermedades infecciosas.'),
(14, 'IntegralCare', 'Seguro médico integral con servicios de atención médica primaria y especializada.'),
(15, 'VidaSegura', 'Seguro médico con opciones flexibles para adaptarse a diferentes necesidades.'),
(16, 'ConfianzaSalud', 'Seguro médico que busca generar confianza a través de servicios de calidad y atención personalizada.'),
(17, 'SeguroSalud', 'Seguro médico que ofrece cobertura integral para consultas, exámenes y tratamientos.'),
(18, 'AseguraVida', 'Seguro médico con enfoque en la prevención y tratamiento de enfermedades crónicas.'),
(19, 'ProtegeSalud', 'Seguro médico con amplia red de hospitales y servicios especializados.'),
(20, 'FamiliaSegura', 'Seguro médico diseñado para cubrir a toda la familia con opciones flexibles.'),
(21, 'VidaSana', 'Seguro médico que promueve hábitos de vida saludables y acceso a servicios preventivos.'),
(22, 'CuidaBien', 'Seguro médico con cobertura para emergencias y servicios de atención primaria.'),
(23, 'SaludPlus', 'Seguro médico premium con acceso a servicios médicos de alta calidad.'),
(24, 'VitalSeguro', 'Seguro médico para cuidado integral de la salud, incluyendo medicamentos y terapias.'),
(25, 'BienestarTotal', 'Seguro médico enfocado en el bienestar físico y mental de los asegurados.'),
(26, 'CoberturaCompleta', 'Seguro médico con amplia cobertura para procedimientos quirúrgicos y hospitalización.'),
(27, 'SeguroFamiliar', 'Seguro médico diseñado para brindar protección a toda la familia.'),
(28, 'SaludProtegida', 'Seguro médico con énfasis en la protección contra enfermedades infecciosas.'),
(29, 'IntegralCare', 'Seguro médico integral con servicios de atención médica primaria y especializada.'),
(30, 'VidaSegura', 'Seguro médico con opciones flexibles para adaptarse a diferentes necesidades.'),
(31, 'ConfianzaSalud', 'Seguro médico que busca generar confianza a través de servicios de calidad y atención personalizada.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita` (
  `id` int NOT NULL,
  `fecha` date NOT NULL,
  `comentario` text NOT NULL,
  `diagnostico_id` int NOT NULL,
  `paciente_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `visita`
--

INSERT INTO `visita` (`id`, `fecha`, `comentario`, `diagnostico_id`, `paciente_id`) VALUES
(1, '2023-01-10', 'Consulta de seguimiento. El paciente se queja de dolor de cabeza persistente.', 1, 5),
(2, '2023-02-15', 'Control rutinario. Presión arterial y análisis de sangre en rangos normales.', 3, 5),
(3, '2023-03-20', 'Realizada radiografía para evaluar la lesión en la pierna derecha.', 3, 5),
(4, '2023-04-25', 'Ecografía abdominal para evaluar la función hepática y renal.', 4, 5),
(5, '2023-05-30', 'Tomografía computarizada del pecho para evaluar problemas respiratorios.', 5, 5),
(6, '2023-06-05', 'Electrocardiograma realizado para evaluar la actividad eléctrica del corazón.', 6, 6),
(7, '2023-07-12', 'Consulta para revisar resultados de la colonoscopia. Todo en orden.', 7, 7),
(8, '2023-08-18', 'Endoscopia gástrica para evaluar molestias estomacales.', 8, 8),
(9, '2023-09-22', 'Prueba de esfuerzo realizada para evaluar la capacidad cardiovascular.', 9, 9),
(10, '2023-10-28', 'Biopsia de tejido mamario para descartar posibles problemas.', 10, 10),
(11, '2023-11-02', 'Consulta por reacción alérgica. Prescrito tratamiento antialérgico.', 11, 11),
(12, '2023-12-09', 'Hemograma completo para evaluar recuento de glóbulos y estado general.', 12, 12),
(13, '2024-01-15', 'Cistoscopia para evaluar problemas urinarios. No se encontraron anomalías.', 13, 13),
(14, '2024-02-20', 'Mamografía de control para detección temprana de posibles problemas mamarios.', 14, 14),
(15, '2024-03-25', 'Consulta médica general. El paciente se queja de fatiga persistente.', 15, 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita_medicacion`
--

CREATE TABLE `visita_medicacion` (
  `id` int NOT NULL,
  `visita_id` int NOT NULL,
  `medicacion_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `visita_medicacion`
--

INSERT INTO `visita_medicacion` (`id`, `visita_id`, `medicacion_id`) VALUES
(2, 10, 63),
(3, 13, 64),
(4, 1, 63),
(5, 2, 64);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita_prueba`
--

CREATE TABLE `visita_prueba` (
  `id` int NOT NULL,
  `visita_id` int NOT NULL,
  `prueba_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `visita_prueba`
--

INSERT INTO `visita_prueba` (`id`, `visita_id`, `prueba_id`) VALUES
(2, 10, 2),
(3, 13, 10),
(4, 1, 1),
(5, 2, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `calendario`
--
ALTER TABLE `calendario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `medicacion`
--
ALTER TABLE `medicacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `medicacion_id_index` (`id`),
  ADD KEY `medida_id` (`medida_id`);

--
-- Indices de la tabla `medida`
--
ALTER TABLE `medida`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `seguromedico_id` (`seguromedico_id`);

--
-- Indices de la tabla `progenitor`
--
ALTER TABLE `progenitor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `paciente_id` (`paciente_id`);

--
-- Indices de la tabla `prueba`
--
ALTER TABLE `prueba`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `seguromedico`
--
ALTER TABLE `seguromedico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`id`),
  ADD KEY `diagnostico_id` (`diagnostico_id`),
  ADD KEY `paciente_id` (`paciente_id`);

--
-- Indices de la tabla `visita_medicacion`
--
ALTER TABLE `visita_medicacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `visita_id` (`visita_id`),
  ADD KEY `medicacion_id` (`medicacion_id`);

--
-- Indices de la tabla `visita_prueba`
--
ALTER TABLE `visita_prueba`
  ADD PRIMARY KEY (`id`),
  ADD KEY `visita_id` (`visita_id`),
  ADD KEY `prueba_id` (`prueba_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `calendario`
--
ALTER TABLE `calendario`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `diagnostico`
--
ALTER TABLE `diagnostico`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `medicacion`
--
ALTER TABLE `medicacion`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `medida`
--
ALTER TABLE `medida`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `progenitor`
--
ALTER TABLE `progenitor`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `prueba`
--
ALTER TABLE `prueba`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `seguromedico`
--
ALTER TABLE `seguromedico`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `visita`
--
ALTER TABLE `visita`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `visita_medicacion`
--
ALTER TABLE `visita_medicacion`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `visita_prueba`
--
ALTER TABLE `visita_prueba`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `medicacion`
--
ALTER TABLE `medicacion`
  ADD CONSTRAINT `medicacion_ibfk_1` FOREIGN KEY (`medida_id`) REFERENCES `medida` (`id`);

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`seguromedico_id`) REFERENCES `seguromedico` (`id`);

--
-- Filtros para la tabla `progenitor`
--
ALTER TABLE `progenitor`
  ADD CONSTRAINT `progenitor_ibfk_1` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`);

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`diagnostico_id`) REFERENCES `diagnostico` (`id`),
  ADD CONSTRAINT `visita_ibfk_2` FOREIGN KEY (`paciente_id`) REFERENCES `paciente` (`id`);

--
-- Filtros para la tabla `visita_medicacion`
--
ALTER TABLE `visita_medicacion`
  ADD CONSTRAINT `visita_medicacion_ibfk_1` FOREIGN KEY (`visita_id`) REFERENCES `visita` (`id`);

--
-- Filtros para la tabla `visita_prueba`
--
ALTER TABLE `visita_prueba`
  ADD CONSTRAINT `visita_prueba_ibfk_1` FOREIGN KEY (`visita_id`) REFERENCES `visita` (`id`),
  ADD CONSTRAINT `visita_prueba_ibfk_2` FOREIGN KEY (`prueba_id`) REFERENCES `prueba` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
